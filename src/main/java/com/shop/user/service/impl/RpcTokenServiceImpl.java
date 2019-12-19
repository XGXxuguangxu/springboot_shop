package com.shop.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.shop.user.modal.User;
import com.shop.user.service.RpcTokenService;
import com.shop.user.util.Md5;
import com.shop.user.util.RedisUtils;
import nl.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangmeng
 * @date 2019/12/17 15:46
 */

@Service
public class RpcTokenServiceImpl implements RpcTokenService {
    @Autowired
    private RedisUtils redisUtils;


    @Override
    public User getCurrentUser(String token) {
        if (redisUtils.exist(token)){
            String json = redisUtils.get(token).toString();
            User user = JSON.parseObject(json,User.class);
            return user;
        }
        return null;
    }


}
