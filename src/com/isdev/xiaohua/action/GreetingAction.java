package com.isdev.xiaohua.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2018/6/20.
 */
public class GreetingAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String execute() throws Exception {
        if (username == null || username.equals("")) {
           return ERROR;
        } else {
            return SUCCESS;
        }
    }
}
