package com.shop.user.controller;

import com.shop.user.modal.Collect;
import com.shop.user.service.CollectService;
import com.shop.user.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * （收藏控制器）
 *
 * @author wanghe
 * @date 2019/12/17 10:08
 */
@Controller
public class CollectController {

    @Autowired
    private CollectService collectService;

    @RequestMapping(value = "/findCollectList",method = RequestMethod.POST)
    @ResponseBody//带参
    //@RequestBody  不带参
    public Page<Collect> findCollectList(Integer index, Integer size){
        return collectService.findCollectList(index,2);
    }

    @PostMapping(value = "/addCollect")
    @ResponseBody
    public String addCollect(Collect collect){
        collectService.addCollect(collect);
        return "ok";
    }

    @PostMapping(value = "/deleteCollect")
    @ResponseBody
    public String deleteCollect(Integer id){
        collectService.deleteCollect(id);
        return "ok";
    }

    @PostMapping(value = "/getCollectPhone")
    @ResponseBody
    public List<Collect> getCollectPhone(String phone){
        return collectService.getCollectPhone(phone);
    }
}
