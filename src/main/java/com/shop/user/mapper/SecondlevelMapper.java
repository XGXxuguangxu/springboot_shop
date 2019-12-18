package com.shop.user.mapper;

import com.shop.user.modal.Secondlevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * （二级技能Mapper）
 *
 * @author wanghe
 * @date 2019/12/18 17:06
 */
@Mapper
public interface SecondlevelMapper {
    /**
     *@描述  （查询全部二级技能表）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public List<Secondlevel> findSecondlevelAll();
}
