package com.shop.user.modal;

import java.io.Serializable;

/**
 *朋友圈表
 */
public class Circlefriends implements Serializable {
    private Integer id;    //自增ID
    private User user = new User();//关联用户表
    private Integer type;  //人员发布类型（1.用工2.务工）
    private String addTime;//发布时间
    private String content;//发布内容
    private String address;//发布图片地址
    private Integer browse;//浏览量
    private Integer give;  //点赞量
    private Integer show;  //是否显示(1.显2.不显)
    private Integer state; //朋友圈状态（可随时下架）

    public Circlefriends(Integer id, User user, Integer type, String addTime, String content, String address, Integer browse, Integer give, Integer show, Integer state) {
        this.id = id;
        this.user = user;
        this.type = type;
        this.addTime = addTime;
        this.content = content;
        this.address = address;
        this.browse = browse;
        this.give = give;
        this.show = show;
        this.state = state;
    }

    public Circlefriends() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public Integer getGive() {
        return give;
    }

    public void setGive(Integer give) {
        this.give = give;
    }

    public Integer getShow() {
        return show;
    }

    public void setShow(Integer show) {
        this.show = show;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
