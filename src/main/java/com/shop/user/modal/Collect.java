package com.shop.user.modal;

import java.io.Serializable;

/**
 *收藏表
 */
public class Collect implements Serializable {
    private  Integer id;       //自增ID
    private  Integer sid;      //收藏人id
    private  Integer bid;      //被收藏人id
    private  Integer type;     //被收藏类型（1.个人2.企业）
    private  String collectTime;//收藏时间
    private  Integer collectState;//收藏状态（是否有效）删不删是不是显示
    private  String phone;     //收藏人手机号
    private  String qitac;      //其他

    public Collect(Integer id, Integer sid, Integer bid, Integer type, String collectTime, Integer collectState, String phone, String qitac) {
        this.id = id;
        this.sid = sid;
        this.bid = bid;
        this.type = type;
        this.collectTime = collectTime;
        this.collectState = collectState;
        this.phone = phone;
        this.qitac = qitac;
    }

    public Collect() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    public Integer getCollectState() {
        return collectState;
    }

    public void setCollectState(Integer collectState) {
        this.collectState = collectState;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQitac() {
        return qitac;
    }

    public void setQitac(String qitac) {
        this.qitac = qitac;
    }
}
