package com.shop.user.controller;

import com.aliyuncs.exceptions.ClientException;
import com.shop.user.modal.Merchant;
import com.shop.user.service.MerchantService;
import com.shop.user.util.Result;
import com.shop.user.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xuguangxu
 * @date 2019/12/18 10:55
 */
@RestController
@CrossOrigin
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;
    /**
     * 发送短信验证码
     * @param mobile
     */
    @RequestMapping(value="/sendsms/{mobile}",method= RequestMethod.POST)
    public Result sendsms(@PathVariable String mobile ) throws ClientException {
        merchantService.sendSms(mobile);
        return new Result(true, StatusCode.OK,"发送成功");
    }
    /**
     * 商家注册
     * @param merchant
     */
    @RequestMapping(value="/register/{code}",method=RequestMethod.POST)
    public Result register(@RequestBody Merchant merchant , @PathVariable String
            code){
        merchantService.add(merchant,code);
        return new Result(true,StatusCode.OK,"注册成功");
    }

    /***
     * 登录
     * @param merchant
     * @param
     * @return
     */
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public Result login(@RequestBody Merchant merchant){
        /***
         * 返回商家信息
         */
        Merchant m=merchantService.login(merchant);
        return new Result(true,StatusCode.OK,"登录成功",m);
    }
}
