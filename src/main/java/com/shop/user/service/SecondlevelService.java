package com.shop.user.service;

import com.shop.user.modal.Secondlevel;

import java.util.List;

/**
 * （二级技能表Service外键）
 *
 * @author wanghe
 * @date 2019/12/18 17:09
 */
public interface SecondlevelService {
    /**
     *@描述  （查询全部二级技能表）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public List<Secondlevel> findSecondlevelAll();
}
