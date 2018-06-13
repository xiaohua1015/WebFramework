package com.isdev.xiaohua.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2018/6/13.
 */
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String add () throws Exception {
        System.out.println("add add add add ");
        info = "添加用户信息";
        return "add";
    }

    public String update () throws Exception {
        info = "更新用户信息";
        return "update";
    }
}