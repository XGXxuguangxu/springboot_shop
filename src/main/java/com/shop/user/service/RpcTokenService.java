package com.shop.user.service;

import com.shop.user.modal.User;

/**
 * @author wangmeng
 * @date 2019/12/17 15:40
 */
public interface RpcTokenService {
    public User getCurrentUser(String token);
}
