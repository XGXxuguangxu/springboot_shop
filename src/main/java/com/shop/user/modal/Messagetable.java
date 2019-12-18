package com.shop.user.modal;

import java.io.Serializable;

/**
 *商家对务工留言记录表
 */
public class Messagetable implements Serializable {
    private Integer id;              //自增ID
    private Merchant merchant= new Merchant();//关联商家表
    private String messageContents;  //留言内容
    private String messageTime;      //留言时间
    private Integer messageState;    //留言审核状态(1.通过2.未通过)
    private Integer type;            //被留言人类型（1.企业2.我们3.个人）
    private Integer state;           //留言处理(1.正2.违)

    public Messagetable(Integer id, Merchant merchant, String messageContents, String messageTime, Integer messageState, Integer type, Integer state) {
        this.id = id;
        this.merchant = merchant;
        this.messageContents = messageContents;
        this.messageTime = messageTime;
        this.messageState = messageState;
        this.type = type;
        this.state = state;
    }

    public Messagetable() {
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

    public String getMessageContents() {
        return messageContents;
    }

    public void setMessageContents(String messageContents) {
        this.messageContents = messageContents;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    public Integer getMessageState() {
        return messageState;
    }

    public void setMessageState(Integer messageState) {
        this.messageState = messageState;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
