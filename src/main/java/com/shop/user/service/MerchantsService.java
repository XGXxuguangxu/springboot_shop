package com.shop.user.service;

import com.shop.user.modal.Merchant;

import java.util.List;

/**
 * （商家表外键全查）
 *
 * @author wanghe
 * @date 2019/12/18 17:03
 */
public interface MerchantsService {
    /**
     *@描述  （查询全部商家信息）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/18
     */
    public List<Merchant> findMerchantAll();
}
