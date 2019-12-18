package com.shop.user.modal;

import java.io.Serializable;

/**
 *   轮播图表
 */
public class Slideshow implements Serializable {
    private Integer id;        //自增ID
    private String name;      //名称
    private String address;   //图片地址
    private Integer pictureState; //图片状态(1.通2.未)
    private String releaseTime;  //发布时间
    private String displayTime;  //展示时间
    private String endTime;      //展示结束时间
    private Integer type;         //轮播图类型（1.宣传，2.招商。。。）
    private Integer state;        //图片状态（1.展示，2.展示中，3.一结束）

    public Slideshow(Integer id, String name, String address, Integer pictureState, String releaseTime, String displayTime, String endTime, Integer type, Integer state) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.pictureState = pictureState;
        this.releaseTime = releaseTime;
        this.displayTime = displayTime;
        this.endTime = endTime;
        this.type = type;
        this.state = state;
    }

    public Slideshow() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPictureState() {
        return pictureState;
    }

    public void setPictureState(Integer pictureState) {
        this.pictureState = pictureState;
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
