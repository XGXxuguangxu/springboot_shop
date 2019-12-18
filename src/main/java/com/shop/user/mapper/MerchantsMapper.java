package com.shop.user.mapper;

import com.shop.user.modal.Merchant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * （商家表mapper）
 *
 * @author wanghe
 * @date 2019/12/18 16:48
 */
@Mapper
public interface MerchantsMapper {

    /**
     *@描述  （商家表全部查询）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/18
     */
    public List<Merchant> findMerchantAll();
}
