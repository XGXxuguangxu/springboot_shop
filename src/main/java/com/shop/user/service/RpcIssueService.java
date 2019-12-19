package com.shop.user.service;

/**
 * @author wangmeng
 * @date 2019/12/18 16:29
 */
public interface RpcIssueService {
    //把接单信息存入redis
    public void initIssueDbToRedis()throws Exception;
    //检查库存信息
    public int checkIssue(String issueId)throws Exception;
    //锁定商品信息，执行接单记录的添加，修改redis中的库存信息
    int lockIssue(String issueId, String userId)throws Exception;
}
