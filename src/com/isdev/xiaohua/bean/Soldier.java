package com.isdev.xiaohua.bean;

/**
 * Created by Administrator on 2018/6/22.
 */
public class Soldier {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String say() {
        return "我是一个兵";
    }
}
