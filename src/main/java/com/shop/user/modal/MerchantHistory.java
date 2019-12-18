package com.shop.user.modal;

import java.io.Serializable;

/**
 *商家历史表
 */
public class MerchantHistory implements Serializable {


    private Integer id;
    private String history;//搜索历史
    private Merchant  merchant = new Merchant();//关联商家表

    public MerchantHistory(Integer id, String history, Merchant merchant) {
        this.id = id;
        this.history = history;
        this.merchant = merchant;
    }

    public MerchantHistory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }
}
