package com.shop.user.mapper;

import com.shop.user.modal.Issue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * （发布记录表mapper）
 *
 * @author wanghe
 * @date 2019/12/18 16:53
 */
@Mapper
public interface IssueMapper {
    /**
     *@描述  （全部查询+分页  发布记录表）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public List<Issue> getIssueList(Map<String,Object> map);

    /**
     *@描述  （发布记录表总数）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public Integer findIssueCount(Map<String,Object>map);

    /**
     *@描述  （所有发布信息添加）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public Integer addIssue(Issue issue);

    /**
     *@描述  （修改订单信息）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public Integer updateIssue(Issue issue);

    /**
     *@描述  （删除发布的订单信息）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public Integer deleteIssue(Integer id);

    /**
     *@描述  （根据手机号查询自己发布的订单）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/17
     */
    public List<Issue> getIssue(String iphone);
}
