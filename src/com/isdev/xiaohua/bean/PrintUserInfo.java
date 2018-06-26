package com.isdev.xiaohua.bean;

/**
 * Created by Administrator on 2018/6/27.
 */
public class PrintUserInfo {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void printInfo() {
        System.out.println("user = " + user.toString());
    }
}
