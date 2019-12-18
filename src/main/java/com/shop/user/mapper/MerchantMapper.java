package com.shop.user.mapper;

import com.shop.user.modal.Merchant;

import com.shop.user.modal.MerchantExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @author xuguangxu
 * @date 2019/12/17 11:46
 */
public interface MerchantMapper {
    int countByExample(MerchantExample example);

    int deleteByExample(MerchantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    List<Merchant> selectByExample(MerchantExample example);

    Merchant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByExample(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}
