package com.shop.user.service.impl;

import com.shop.user.mapper.IssueMapper;
import com.shop.user.modal.Issue;
import com.shop.user.service.IssueService;
import com.shop.user.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * （发布记录表Service实现）
 *
 * @author wanghe
 * @date 2019/12/18 16:58
 */
@Service
public class IssueServiceImpl implements IssueService {

    @Autowired(required = false )
    private IssueMapper issueMapper;
    @Override
    public Page<Issue> getIssueList(Integer index, Integer size) {
        Map<String,Object> map=new HashMap<>();
        map.put("start",(index-1)*size);
        map.put("size",size);
        List<Issue> list=issueMapper.getIssueList(map);
        Integer count = issueMapper.findIssueCount(map);
        Page<Issue>page=new Page<>();
        page.setIndex(index);
        page.setCount(count);
        page.setSize(size);
        page.setList(list);
        return page;
    }

    @Override
    public Integer addIssue(Issue issue) {
        return issueMapper.addIssue(issue);
    }

    @Override
    public Integer updateIssue(Issue issue) {
        return issueMapper.updateIssue(issue);
    }

    @Override
    public Integer deleteIssue(Integer id) {
        return issueMapper.deleteIssue(id);
    }

    @Override
    public List<Issue> getIssue(String iphone) {
        return issueMapper.getIssue(iphone);
    }
}
