package com.shop.user.service.impl;

import com.shop.user.mapper.SecondlevelMapper;
import com.shop.user.modal.Secondlevel;
import com.shop.user.service.SecondlevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * （二级技能表全查实现）
 *
 * @author wanghe
 * @date 2019/12/18 17:10
 */
@Service
public class SecondlevelServiceImpl implements SecondlevelService {
    @Autowired
    private SecondlevelMapper secondlevelMapper;

    @Override
    public List
            <Secondlevel> findSecondlevelAll() {
        return secondlevelMapper.findSecondlevelAll();
    }
}
