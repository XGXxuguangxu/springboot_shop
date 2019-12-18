package com.shop.user.modal;

import java.io.Serializable;

/**
 *发布记录表
 */
public class Issue implements Serializable {
    private Integer id;       //自增ID
    private Merchant merchant = new Merchant();  //关联用商家表
    private Secondlevel secondlevel = new Secondlevel();//二级技能类型外键id
    private String describe;  //详情描述
    private String headline;  //标题
    private Double price;     //价格
    private Integer number;   //人数
    private String address;   //地址（区域）
    private Integer state;    //发布审核状态（审核中。。。）
    private Integer forcedState;//强制状态（违规可强制下架1.是2.否）
    private Double money;     //定金（从客户余额扣除）
    private Integer bxid;     //关联保险表外键   无表！
    private String payment;   //支付方式
    private Double paymentAmount; //支付金额
    private String releaseTime;   //发布时间
    private String picture;       //图片
    private Integer istate;//发布任务的状态(1.接取2.未接取)/新增
    private String iphone;//手机号(登录的手机号)/新增
    private Integer stock;//任务数量/新增

    public Issue() {
    }

    public Issue(Integer id, Merchant merchant, Secondlevel secondlevel, String describe, String headline, Double price, Integer number, String address, Integer state, Integer forcedState, Double money, Integer bxid, String payment, Double paymentAmount, String releaseTime, String picture, Integer istate, String iphone, Integer stock) {
        this.id = id;
        this.merchant = merchant;
        this.secondlevel = secondlevel;
        this.describe = describe;
        this.headline = headline;
        this.price = price;
        this.number = number;
        this.address = address;
        this.state = state;
        this.forcedState = forcedState;
        this.money = money;
        this.bxid = bxid;
        this.payment = payment;
        this.paymentAmount = paymentAmount;
        this.releaseTime = releaseTime;
        this.picture = picture;
        this.istate = istate;
        this.iphone = iphone;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Secondlevel getSecondlevel() {
        return secondlevel;
    }

    public void setSecondlevel(Secondlevel secondlevel) {
        this.secondlevel = secondlevel;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getForcedState() {
        return forcedState;
    }

    public void setForcedState(Integer forcedState) {
        this.forcedState = forcedState;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getBxid() {
        return bxid;
    }

    public void setBxid(Integer bxid) {
        this.bxid = bxid;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getIstate() {
        return istate;
    }

    public void setIstate(Integer istate) {
        this.istate = istate;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
