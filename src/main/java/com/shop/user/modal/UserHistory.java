package com.shop.user.modal;

import java.io.Serializable;

/**
 *用户搜索历史
 */
public class UserHistory implements Serializable {


    private Integer id;
    private String history;//搜索历史
    private User user = new User();//关用户表

    public UserHistory(Integer id, String history, User user) {
        this.id = id;
        this.history = history;
        this.user = user;
    }

    public UserHistory() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
