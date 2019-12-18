package com.shop.user.modal;

import java.io.Serializable;

public class Message implements Serializable {
    private Integer id;//抢单主键
    private String userId;//用户id
    private String issueId;//任务编号
    private Integer status;//状态
    private Double amount;//金额
    private String createdTime;//创建时间
    private String updateTime;//修改时间

    public Message() {
    }


    public Message(Integer id, String userId, String issueId, Integer status, Double amount, String createdTime, String updateTime) {
        this.id = id;
        this.userId = userId;
        this.issueId = issueId;
        this.status = status;
        this.amount = amount;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
