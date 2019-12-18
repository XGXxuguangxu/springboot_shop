package com.shop.user.modal;

import java.io.Serializable;

/**
 *   临时订单表
 */
public class Temporaryorder implements Serializable {
    private  String id;          //自动发生成编号
    private User user= new User();  //用户id外键
    private  Merchant merchant = new Merchant();//商家id外键
    private  String headline;  //标题
    private  String describe;  //详情描述
    private  Double price;     //价格
    private  Integer number;   //人数
    private  String address;   //地址
    private  Integer bxid;     //关联保险表  无表！
    private  Double money;     //金额
    private String picture;       //图片

    public Temporaryorder(String id, User user, Merchant merchant, String headline, String describe, Double price, Integer number, String address, Integer bxid, Double money, String picture) {
        this.id = id;
        this.user = user;
        this.merchant = merchant;
        this.headline = headline;
        this.describe = describe;
        this.price = price;
        this.number = number;
        this.address = address;
        this.bxid = bxid;
        this.money = money;
        this.picture = picture;
    }

    public Temporaryorder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBxid() {
        return bxid;
    }

    public void setBxid(Integer bxid) {
        this.bxid = bxid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
