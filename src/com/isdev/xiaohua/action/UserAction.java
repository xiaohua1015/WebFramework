package com.isdev.xiaohua.action;

import com.opensymphony.xwork2.ActionContext;
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
        info = "添加用户信息";
        System.out.println("request = " + ActionContext.getContext().get("request"));
        System.out.println("session = " + ActionContext.getContext().getSession());
        System.out.println("application = " + ActionContext.getContext().getApplication() );
        return "add";
    }

    public String update () throws Exception {
        info = "更新用户信息";
        return "update";
    }
}
