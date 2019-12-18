package com.shop.user.modal;

import java.io.Serializable;

/**
 *订单记录表
 */
public class Orderform implements Serializable {
    private Integer id;             //自增ID
    private Orderlist orderlist = new Orderlist();//关联订单编号
    private Capital capital =new Capital();       //资金流水表关联外键
    private String startTime;       //开工时间
    private String completion;      //竣工时间
    private String acknowledging;   //确认时间
    private Integer currentState;   //订单当前状态
    private Integer orderStates;    //订单状态（后台强制下架用1.正常2.异常）
    private Integer query;          //是否疑问单或疑问单编号（1.2）
    private Integer orderAttention; //订单关注量
    private Integer bxstatus;       //保险状态
    private String ygNumber;        //用工保单号
    private String wgNumber;        //务工保单号

    public Orderform(Integer id, Orderlist orderlist, Capital capital, String startTime, String completion, String acknowledging, Integer currentState, Integer orderStates, Integer query, Integer orderAttention, Integer bxstatus, String ygNumber, String wgNumber) {
        this.id = id;
        this.orderlist = orderlist;
        this.capital = capital;
        this.startTime = startTime;
        this.completion = completion;
        this.acknowledging = acknowledging;
        this.currentState = currentState;
        this.orderStates = orderStates;
        this.query = query;
        this.orderAttention = orderAttention;
        this.bxstatus = bxstatus;
        this.ygNumber = ygNumber;
        this.wgNumber = wgNumber;
    }

    public Orderform() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Orderlist getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(Orderlist orderlist) {
        this.orderlist = orderlist;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    public String getAcknowledging() {
        return acknowledging;
    }

    public void setAcknowledging(String acknowledging) {
        this.acknowledging = acknowledging;
    }

    public Integer getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    public Integer getOrderStates() {
        return orderStates;
    }

    public void setOrderStates(Integer orderStates) {
        this.orderStates = orderStates;
    }

    public Integer getQuery() {
        return query;
    }

    public void setQuery(Integer query) {
        this.query = query;
    }

    public Integer getOrderAttention() {
        return orderAttention;
    }

    public void setOrderAttention(Integer orderAttention) {
        this.orderAttention = orderAttention;
    }

    public Integer getBxstatus() {
        return bxstatus;
    }

    public void setBxstatus(Integer bxstatus) {
        this.bxstatus = bxstatus;
    }

    public String getYgNumber() {
        return ygNumber;
    }

    public void setYgNumber(String ygNumber) {
        this.ygNumber = ygNumber;
    }

    public String getWgNumber() {
        return wgNumber;
    }

    public void setWgNumber(String wgNumber) {
        this.wgNumber = wgNumber;
    }
}
