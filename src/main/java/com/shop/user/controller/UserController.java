package com.shop.user.controller;

import com.aliyuncs.exceptions.ClientException;
import com.shop.user.modal.User;
import com.shop.user.util.Result;
import com.shop.user.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shop.user.service.UserService;
/**
 * 控制器层
 * @author xuguangxu
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * 发送短信验证码
	 * @param mobile
	 */
	@RequestMapping(value="/sendsms/{mobile}",method=RequestMethod.POST)
	public Result sendsms(@PathVariable String mobile ) throws ClientException {
		userService.sendSms(mobile);
		return new Result(true,StatusCode.OK,"发送成功");
	}
	/**
	 * 用户注册
	 * @param user
	 */
	@RequestMapping(value="/register/{code}",method=RequestMethod.POST)
	public Result register(@RequestBody User user , @PathVariable String
			code){
		userService.add(user,code);
		return new Result(true,StatusCode.OK,"注册成功");
	}

	/***
	 * 登录
	 * @param user
	 * @param
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Result login(@RequestBody User user){
		/***
		 * 返回用户信息
		 */
		User u=userService.login(user);
		return new Result(true,StatusCode.OK,"登录成功",u);
	}

}
