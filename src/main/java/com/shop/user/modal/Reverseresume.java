package com.shop.user.modal;

import java.io.Serializable;

/**
 *  逆向简历推送表
 */
public class Reverseresume implements Serializable {
    private Integer id;      //自增ID
    private Integer jid;     //接收者id
    private Integer jType;   //接收者类型（1.企业2.个人）
    private Integer tid;     //推送者id
    private Integer tType;   //推送者类型（1.企业2.个人）
    private Integer rid;     //推送简历编号关联简历表外键
    private Integer cid;     //推送者朋友圈编号关联朋友圈id
    private String rightTime;//推送时间
    private Integer state;   //接收状态（1.已接受2.未接受3.已结束）
    private String qita;     //其他

    public Reverseresume(Integer id, Integer jid, Integer jType, Integer tid, Integer tType, Integer rid, Integer cid, String rightTime, Integer state, String qita) {
        this.id = id;
        this.jid = jid;
        this.jType = jType;
        this.tid = tid;
        this.tType = tType;
        this.rid = rid;
        this.cid = cid;
        this.rightTime = rightTime;
        this.state = state;
        this.qita = qita;
    }

    public Reverseresume() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getjType() {
        return jType;
    }

    public void setjType(Integer jType) {
        this.jType = jType;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer gettType() {
        return tType;
    }

    public void settType(Integer tType) {
        this.tType = tType;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getRightTime() {
        return rightTime;
    }

    public void setRightTime(String rightTime) {
        this.rightTime = rightTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getQita() {
        return qita;
    }

    public void setQita(String qita) {
        this.qita = qita;
    }
}
