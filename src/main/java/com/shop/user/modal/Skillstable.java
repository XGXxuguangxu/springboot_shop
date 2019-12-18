package com.shop.user.modal;

import java.io.Serializable;

/**
 *技能信息记录表
 */
public class Skillstable implements Serializable {
    private Integer id;           // 自增ID
    private String skillName;     //技能证名称
    private String number;        //技能证编号
    private String organ;         //技能证发证机关
    private String picture;       //技能证图片（存放图片路径）
    private String type;          //技能类型
    private Integer state;        //证件状态（审核：1.审核中，2.创建中，3.已完成。。。）
    private String issueDate;     //技能证发证时间
    private String validTime;     //技能证有效时间
    private String uploadTime;    //技能证上传时间

    public Skillstable(Integer id, String skillName, String number, String organ, String picture, String type, Integer state, String issueDate, String validTime, String uploadTime) {
        this.id = id;
        this.skillName = skillName;
        this.number = number;
        this.organ = organ;
        this.picture = picture;
        this.type = type;
        this.state = state;
        this.issueDate = issueDate;
        this.validTime = validTime;
        this.uploadTime = uploadTime;
    }

    public Skillstable() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
}

