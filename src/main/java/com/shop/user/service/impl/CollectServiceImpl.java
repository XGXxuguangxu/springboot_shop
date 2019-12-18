package com.shop.user.service.impl;

import com.shop.user.mapper.CollectMapper;
import com.shop.user.modal.Collect;
import com.shop.user.service.CollectService;
import com.shop.user.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * （收藏接口实现类）
 *
 * @author wanghe
 * @date 2019/12/17 10:03
 */
@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;

    @Override
    public Page<Collect> findCollectList(Integer index, Integer size) {
        Map<String,Object> map=new HashMap<>();
        map.put("start",(index-1)*size);
        map.put("size",size);
        List<Collect>list=collectMapper.findCollectList(map);
        Integer count = collectMapper.findCollectCount(map);
        Page<Collect>page=new Page<>();
        page.setIndex(index);
        page.setCount(count);
        page.setSize(size);
        page.setList(list);
        return page;
    }

    @Override
    public Integer addCollect(Collect collect) {
        return collectMapper.addCollect(collect);
    }

    @Override
    public Integer deleteCollect(Integer id) {
        return collectMapper.deleteCollect(id);
    }

    @Override
    public List<Collect> getCollectPhone(String phone) {
        return collectMapper.getCollectPhone(phone);
    }
}
