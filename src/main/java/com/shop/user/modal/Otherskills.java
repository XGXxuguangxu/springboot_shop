package com.shop.user.modal;

import java.io.Serializable;

/**
 *其他技能方式类型表
 */
public class Otherskills implements Serializable {
    private Integer id;      // 自增ID
    private String name;     //名称
    private String describe; //类型描述
    private Integer state;   //类型状态（是否启用）证书有效无效

    public Otherskills(Integer id, String name, String describe, Integer state) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.state = state;
    }

    public Otherskills() {
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
