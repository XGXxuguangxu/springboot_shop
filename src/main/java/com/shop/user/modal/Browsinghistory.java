package com.shop.user.modal;

import java.io.Serializable;

/**
 *浏览记录表
 */
public class Browsinghistory implements Serializable {
    private Integer id;          //自增ID
    private Integer lid;         //浏览者id
    private Integer type;        //浏览者类型（1.企业2.个人）
    private String browsingTime;//浏览时间
    private Integer category;    //浏览类别(1.人才2.商家)
    private String position;    //浏览职位
    private Integer state;       //浏览状态

    public Browsinghistory(Integer id, Integer lid, Integer type, String browsingTime, Integer category, String position, Integer state) {
        this.id = id;
        this.lid = lid;
        this.type = type;
        this.browsingTime = browsingTime;
        this.category = category;
        this.position = position;
        this.state = state;
    }

    public Browsinghistory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getBrowsingTime() {
        return browsingTime;
    }

    public void setBrowsingTime(String browsingTime) {
        this.browsingTime = browsingTime;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
