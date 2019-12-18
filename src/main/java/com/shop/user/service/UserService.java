package com.shop.user.service;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.shop.user.mapper.UserMapper;
import com.shop.user.modal.User;
import com.shop.user.modal.UserExample;
import com.shop.user.sms.SmsUtil;
import com.shop.user.util.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
/**
 * 服务层
 * @author xuguangxu
 */
@Service
public class UserService {
	/***
	 * 防止红色虚线报错不影响
	 */
	@Autowired(required = false)
	private UserMapper userMapper;
	/***
	 * 引入redis和rabbitmq模板
	 */
	@Autowired
	private RedisTemplate redisTemplate;
	/***
	 * 发送短信
	 */
	@Autowired
	private SmsUtil smsUtil;

	@Value("${aliyun.sms.template_code}")
	private String template_code;//模板编号
	@Value("${aliyun.sms.sign_name}")
	private String sign_name;//签名

	/**
	 * 发送短信验证码
	 * @param mobile 手机号
	 */
	public void sendSms(String mobile) throws ClientException {
		//1.生成6位短信验证码
		Random random = new Random();
		int max = 999999;//最大数
		int min = 100000;//最小数
		int code = random.nextInt(max);//随机生成
		System.out.println(code);
		if (code < min) {
			code = code + min;
		}
		System.out.println("你发送的手机验证码为："+code);
		System.out.println(mobile + "收到验证码是：" + code);
		//2.将验证码放入redis,设置10秒中过期
		redisTemplate.opsForValue().set("smscode_" + mobile, code + "", 60, TimeUnit.SECONDS);//五分钟过期
		Map<String, String> map = new HashMap();
		map.put("mobile", mobile);
		map.put("code", code + "");
		//阿里云发送短信
		SendSmsResponse sms=smsUtil.sendSms(map.get("mobile"),template_code,sign_name," {\"code\":\""+ map.get("code") +"\"}");
	    System.out.println("阿里云发送短信响应结果:"+sms.getMessage());
	}


	/***
	 * 新增注册用户
	 * @param user
	 * @param code
	 */
	public void add(User user, String code) {
		//校验用户是否已经注册

		boolean isregister=checkUser(user);
		if(isregister){
			throw new RuntimeException("用户已经注册");
		}
        //判断验证码是否正确
		String syscode =
				(String)redisTemplate.opsForValue().get("smscode_" + user.getPhone());
         //提取系统正确的验证码
		if(syscode==null){
			throw new RuntimeException("验证码失效请重新获取");
		}
		if(!syscode.equals(code)){
			throw new RuntimeException("验证码输入不正确");
		}
		/***
		 * 验证码输入正确则注册用户
		 */
		try {

			user.setPassword(Md5.MD5Pwd(user.getPassword()));

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new RuntimeException("密码加密有误");
		}
		/***phone.substring(0,3)+"****"+phone.substring(phone.length-4)
		 * 设置昵称
		 */
		String phone=user.getPhone();
		//设置昵称
		user.setNickname(phone.substring(0,3)+"****"+phone.substring(phone.length()-4));
		/***
		 * 设置注册日期
		 */
		user.setRegistrationdate(new Date());

		/***
		 * mybaties插入
		 */
		userMapper.insert(user);
	}

	/**
	 * 校验用户是否存在系统
	 * @param user
	 * @return
	 */
	private boolean checkUser(User user) {
		boolean flag=false;
		/**
		 * 构造查询条件
		 */
		UserExample userExample=new UserExample();
		userExample.createCriteria().andPhoneEqualTo(user.getPhone());
		List<User> list=userMapper.selectByExample(userExample);
		if (null!=list&&list.size()>0){
			flag=true;
		}
		return flag;
	}
	/***
	 * 用户登录
	 * @param user
	 */
	public User login(User user) {
		/****
		 * 根据用户名查询用户
		 */
		UserExample userExample=new UserExample();
		userExample.createCriteria().andPhoneEqualTo(user.getPhone());
		List<User> users= userMapper.selectByExample(userExample);
		if(null!=users&&users.size()>0){
			String userpwd= null;
			try {
				userpwd = Md5.MD5Pwd(user.getPassword());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
				throw new RuntimeException("密码加密出错");
			}
			String dbpwd=users.get(0).getPassword();
			if(userpwd.equals(dbpwd)){
				//可以登录
				return users.get(0);
			}else{
				//用户名或者密码失败
				throw new RuntimeException("用户名或者密码错误");
			}
		}else{
			//用户不存在
			throw new RuntimeException("用户不存在");
		}

	}
}