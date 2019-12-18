package com.shop.user.modal;

import java.io.Serializable;

/**
 *身份证信息验证记录表
 */
public class Identity implements Serializable {
    private Integer id;         //自增ID
    private Integer expiryDate; //用户证件有效期(1.有效2.无效)
    private Integer verifyStatu;//验证状态（1.通过，2.未通过）
    private String proofTime;   //验证时间
    private String qitab;       //其他

    public Identity(Integer id, Integer expiryDate, Integer verifyStatu, String proofTime, String qitab) {
        this.id = id;
        this.expiryDate = expiryDate;
        this.verifyStatu = verifyStatu;
        this.proofTime = proofTime;
        this.qitab = qitab;
    }

    public Identity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Integer expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getVerifyStatu() {
        return verifyStatu;
    }

    public void setVerifyStatu(Integer verifyStatu) {
        this.verifyStatu = verifyStatu;
    }

    public String getProofTime() {
        return proofTime;
    }

    public void setProofTime(String proofTime) {
        this.proofTime = proofTime;
    }

    public String getQitab() {
        return qitab;
    }

    public void setQitab(String qitab) {
        this.qitab = qitab;
    }
}
