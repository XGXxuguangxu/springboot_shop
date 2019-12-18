package com.shop.user.service.impl;

import com.shop.user.service.RpcIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangmeng
 * @date 2019/12/18 16:45
 */

@Service
public class RpcIssueServiceImpl implements RpcIssueService {
    @Autowired

    @Override
    public void initIssueDbToRedis() throws Exception {

    }

    @Override
    public int checkIssue(String issueId) throws Exception {
        return 0;
    }

    @Override
    public int lockIssue(String issueId, String userId) throws Exception {
        return 0;
    }
}
