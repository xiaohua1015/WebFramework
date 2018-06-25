package com.isdev.xiaohua.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2018/6/13.
 */
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private String info;

    private String name;
    private String password;
    private int sex;
    private String province;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String add () throws Exception {
        info = "添加用户信息";

        return "add";
    }

    public String update () throws Exception {
        info = "更新用户信息";
        return "update";
    }

    public String register() throws Exception {
        return "register";
    }
}
