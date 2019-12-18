package com.shop.user.controller;

import com.shop.user.modal.Issue;
import com.shop.user.modal.Merchant;
import com.shop.user.modal.Secondlevel;
import com.shop.user.service.IssueService;
import com.shop.user.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * （发布记录表控制器）
 *
 * @author wanghe
 * @date 2019/12/18 17:01
 */
@Controller
public class IssueController {
    @Autowired
    private IssueService issueService;

    @RequestMapping(value = "/getIssueList",method = RequestMethod.POST)
    @ResponseBody//带参
    //@RequestBody  不带参
    public Page<Issue> getIssueList(Integer index, Integer size){
        return issueService.getIssueList(index,2);
    }

    @PostMapping(value = "/addIssue")
    @ResponseBody
    public String addIssue(Issue issue,Integer mid,Integer sid){
        Merchant merchant = new Merchant();
        merchant.setId(mid);
        Secondlevel secondlevel = new Secondlevel();
        secondlevel.setId(sid);
        issue.setMerchant(merchant);
        issue.setSecondlevel(secondlevel);
        issueService.addIssue(issue);
        return "ok";
    }

    @PostMapping(value = "/updateIssue")
    @ResponseBody
    public String updateIssue(Issue issue,Integer mid,Integer sid){
        Merchant merchant = new Merchant();
        merchant.setId(mid);
        Secondlevel secondlevel = new Secondlevel();
        secondlevel.setId(sid);
        issue.setMerchant(merchant);
        issue.setSecondlevel(secondlevel);
        issueService.updateIssue(issue);
        return "ok";
    }

    @PostMapping(value = "/deleteIssue")
    @ResponseBody
    public String deleteIssue(Integer id){
        issueService.deleteIssue(id);
        return "ok";
    }

    @PostMapping(value = "/getIssue")
    @ResponseBody
    public List<Issue> getIssue(String iphone){
        return issueService.getIssue(iphone);
    }
}
