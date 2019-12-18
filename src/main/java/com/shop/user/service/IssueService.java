package com.shop.user.service;

import com.shop.user.modal.Issue;
import com.shop.user.util.Page;

import java.util.List;

/**
 * （发单表记录service）
 *
 * @author wanghe
 * @date 2019/12/18 16:57
 */
public interface IssueService {
    /**
     *@描述  （全部查询+分页  发布记录表）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/18
     */
    public Page<Issue> getIssueList(Integer index, Integer size);


    /**
     *@描述  （所有发布信息添加）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/18
     */
    public Integer addIssue(Issue issue);

    /**
     *@描述  （修改订单信息）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/18
     */
    public Integer updateIssue(Issue issue);

    /**
     *@描述  （删除发布的订单信息）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/18
     */
    public Integer deleteIssue(Integer id);

    /**
     *@描述  （根据手机号查询自己发布的订单）
     *@参数
     *@返回值
     *@创建人  wanghe
     *@创建时间  2019/12/18
     */
    public List<Issue> getIssue(String iphone);
}
