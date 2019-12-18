package com.shop.user.service.impl;

import com.shop.user.mapper.MerchantsMapper;
import com.shop.user.modal.Merchant;
import com.shop.user.service.MerchantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * （描述）
 *
 * @author wanghe
 * @date 2019/12/18 17:04
 */
@Service
public class MerchantsServiceImpl implements MerchantsService {

    @Autowired
    private MerchantsMapper merchantMapper;

    @Override
    public List<Merchant> findMerchantAll() {
        return merchantMapper.findMerchantAll();
    }
}
