package com.shop.user.mapper;

import com.shop.user.modal.Collect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * （收藏Mapper）
 *
 * @author wanghe
 * @date 2019/12/17 9:38
 */
@Mapper
public interface CollectMapper {
    /**
     *@描述  （收藏表分页）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public List<Collect> findCollectList(Map<String,Object> map);

    /**
     *@描述  （收藏列表总记录数）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public Integer findCollectCount(Map<String,Object>map);

    /**
     *@描述  （添加收藏）
     *@参数  Collect
     *@返回值  Integer
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public Integer addCollect(Collect collect);

    /**
     *@描述  （删除）
     *@参数  id
     *@返回值  Integer
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public Integer deleteCollect(Integer id);

    /**
     *@描述  （根据手机号查询所有收藏）
     *@参数  phone
     *@返回值  List<Collect></>
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public List<Collect> getCollectPhone(String phone);
}
