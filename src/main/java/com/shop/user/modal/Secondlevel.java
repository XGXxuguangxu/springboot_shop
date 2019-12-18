package com.shop.user.modal;

import java.io.Serializable;

/**
 * 技能二级类别表
 */
public class Secondlevel implements Serializable {
    private Integer id;       //自增ID
    private String names;     //技能名称
    private Integer rankings; //技能类别（内部排名）
    private Integer states;   //技能状态（1.显示，2.不显示）
    private Stairlevel stairlevel = new Stairlevel();//关联一级类型
    private Double advance;  //预付款
    private String  skillsDescribe; //技能描述

    public Secondlevel(Integer id, String names, Integer rankings, Integer states, Stairlevel stairlevel, Double advance, String skillsDescribe) {
        this.id = id;
        this.names = names;
        this.rankings = rankings;
        this.states = states;
        this.stairlevel = stairlevel;
        this.advance = advance;
        this.skillsDescribe = skillsDescribe;
    }

    public Secondlevel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Integer getRankings() {
        return rankings;
    }

    public void setRankings(Integer rankings) {
        this.rankings = rankings;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public Stairlevel getStairlevel() {
        return stairlevel;
    }

    public void setStairlevel(Stairlevel stairlevel) {
        this.stairlevel = stairlevel;
    }

    public Double getAdvance() {
        return advance;
    }

    public void setAdvance(Double advance) {
        this.advance = advance;
    }

    public String getSkillsDescribe() {
        return skillsDescribe;
    }

    public void setSkillsDescribe(String skillsDescribe) {
        this.skillsDescribe = skillsDescribe;
    }
}
