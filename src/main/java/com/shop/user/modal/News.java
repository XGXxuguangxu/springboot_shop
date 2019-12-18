package com.shop.user.modal;

import java.io.Serializable;

/**
 *新闻表
 */
public class News implements Serializable {
    private Integer id;         //自增ID
    private String headline;    //新闻标题
    private String specific;    //针对人群
    private String newsContent; //新闻内容
    private String newsAddress; //新闻图片地址
    private String releaseTime; //发布时间
    private String displayTime; //展示时间
    private String endTime;     //展示结束时间
    private String location;    //展示位置（位置区域）
    private Integer inform;     //提醒方式（1.通知2.展示）
    private Integer newsState;  //新闻状态(1.通2.未)

    public News(Integer id, String headline, String specific, String newsContent, String newsAddress, String releaseTime, String displayTime, String endTime, String location, Integer inform, Integer newsState) {
        this.id = id;
        this.headline = headline;
        this.specific = specific;
        this.newsContent = newsContent;
        this.newsAddress = newsAddress;
        this.releaseTime = releaseTime;
        this.displayTime = displayTime;
        this.endTime = endTime;
        this.location = location;
        this.inform = inform;
        this.newsState = newsState;
    }

    public News() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsAddress() {
        return newsAddress;
    }

    public void setNewsAddress(String newsAddress) {
        this.newsAddress = newsAddress;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getInform() {
        return inform;
    }

    public void setInform(Integer inform) {
        this.inform = inform;
    }

    public Integer getNewsState() {
        return newsState;
    }

    public void setNewsState(Integer newsState) {
        this.newsState = newsState;
    }
}
