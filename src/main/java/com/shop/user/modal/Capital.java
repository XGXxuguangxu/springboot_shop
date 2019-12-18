package com.shop.user.modal;

import java.io.Serializable;

/**
 *资金流水表
 */
public class Capital implements Serializable {
    private Integer id;       //自增ID
    private Merchant merchant =  new Merchant();//关联商家表ID
    private User user = new User();//关联用户表
    private Double money;     //金额
    private Double balance;   //余额
    private Integer way;       //方式（1.支付宝2.微信3.第三方。。）
    private Integer stateFunding;//资金状态
    private String startingTime;//发起时间
    private String accountingDate;//到账时间
    private Integer emergency;  //紧急拦截

    public Capital(Integer id, Merchant merchant, User user, Double money, Double balance, Integer way, Integer stateFunding, String startingTime, String accountingDate, Integer emergency) {
        this.id = id;
        this.merchant = merchant;
        this.user = user;
        this.money = money;
        this.balance = balance;
        this.way = way;
        this.stateFunding = stateFunding;
        this.startingTime = startingTime;
        this.accountingDate = accountingDate;
        this.emergency = emergency;
    }

    public Capital() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getWay() {
        return way;
    }

    public void setWay(Integer way) {
        this.way = way;
    }

    public Integer getStateFunding() {
        return stateFunding;
    }

    public void setStateFunding(Integer stateFunding) {
        this.stateFunding = stateFunding;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
    }

    public Integer getEmergency() {
        return emergency;
    }

    public void setEmergency(Integer emergency) {
        this.emergency = emergency;
    }
}
