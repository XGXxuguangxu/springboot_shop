package com.shop.user.modal;

import java.io.Serializable;

/**
 *订单修改记录详情表
 */
public class Orderupdate implements Serializable {
    private Integer id;           //自增 ID
    private Orderlist orderlist = new Orderlist();//订单表id
    private String updatedContent;//更新内容
    private String turnoverTime;  //更新时间
    private Integer orderState;   //订单状态（1.完成，2.待审核）

    public Orderupdate(Integer id, Orderlist orderlist, String updatedContent, String turnoverTime, Integer orderState) {
        this.id = id;
        this.orderlist = orderlist;
        this.updatedContent = updatedContent;
        this.turnoverTime = turnoverTime;
        this.orderState = orderState;
    }

    public Orderupdate() {
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

    public String getUpdatedContent() {
        return updatedContent;
    }

    public void setUpdatedContent(String updatedContent) {
        this.updatedContent = updatedContent;
    }

    public String getTurnoverTime() {
        return turnoverTime;
    }

    public void setTurnoverTime(String turnoverTime) {
        this.turnoverTime = turnoverTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}
