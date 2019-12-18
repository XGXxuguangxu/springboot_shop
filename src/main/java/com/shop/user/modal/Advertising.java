package com.shop.user.modal;

import java.io.Serializable;

/**
 *广告表
 */
public class Advertising implements Serializable {
    private Integer id;          //自增ID
    private String adName;       //广告名称
    private String content;      //广告内容
    private String like;         //广告链接
    private String address;      //图片地址
    private String releaseTime;  //发布时间
    private String displayTime;  //展示时间
    private String endTime;      //展示结束时间
    private String showAddress;  //展示位置（位置区域）
    private Integer state;       //图片状态（1.展示2.展示中3.一结束）
    private String name;         //展示人姓名
    private Integer type;        //展示人类型（1.企业2.个人。。）
    private Integer adState;     //广告状态（强制下线）

    public Advertising(Integer id, String adName, String content, String like, String address, String releaseTime, String displayTime, String endTime, String showAddress, Integer state, String name, Integer type, Integer adState) {
        this.id = id;
        this.adName = adName;
        this.content = content;
        this.like = like;
        this.address = address;
        this.releaseTime = releaseTime;
        this.displayTime = displayTime;
        this.endTime = endTime;
        this.showAddress = showAddress;
        this.state = state;
        this.name = name;
        this.type = type;
        this.adState = adState;
    }

    public Advertising() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(String displayTime) {
        this.displayTime = displayTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getShowAddress() {
        return showAddress;
    }

    public void setShowAddress(String showAddress) {
        this.showAddress = showAddress;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAdState() {
        return adState;
    }

    public void setAdState(Integer adState) {
        this.adState = adState;
    }
}
