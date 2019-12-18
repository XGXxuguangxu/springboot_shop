package com.shop.user.modal;

import java.io.Serializable;

/**
 *   人才推荐表
 */
public class Recommended implements Serializable {
    private Integer id;       //自增ID
    private Integer perid;    //人才id
    private String personType;//人才类型
    private String startTime; //推荐开始时间
    private String endTime;   //推荐结束时间
    private String qitaa;     //其他
    private Integer pageView; //浏览量

    public Recommended(Integer id, Integer perid, String personType, String startTime, String endTime, String qitaa, Integer pageView) {
        this.id = id;
        this.perid = perid;
        this.personType = personType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.qitaa = qitaa;
        this.pageView = pageView;
    }

    public Recommended() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getQitaa() {
        return qitaa;
    }

    public void setQitaa(String qitaa) {
        this.qitaa = qitaa;
    }

    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }
}
