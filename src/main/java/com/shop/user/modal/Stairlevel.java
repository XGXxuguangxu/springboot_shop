package com.shop.user.modal;

import java.io.Serializable;

/**
 *   一级技能类别表
 */
public class Stairlevel implements Serializable {
    private Integer id;        //自增ID
    private String name;       //技能名称
    private Integer ranking;   //技能类别（内部排名）
    private Integer state;     //技能状态（1.显示，2.不显示）

    public Stairlevel(Integer id, String name, Integer ranking, Integer state) {
        this.id = id;
        this.name = name;
        this.ranking = ranking;
        this.state = state;
    }

    public Stairlevel() {
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

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
