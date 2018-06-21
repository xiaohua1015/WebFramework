package com.isdev.xiaohua.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Administrator on 2018/6/22.
 */
public class TestAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Map<String, Object> request;

    private Map<String, Object> session;

    private Map<String, Object> application;

    public TestAction() {
        ActionContext actionContext = ActionContext.getContext();
        request = (Map<String, Object>) actionContext.get("request");
        session = actionContext.getSession();
        application = actionContext.getApplication();
    }

    @Override
    public String execute() throws Exception {
        String name = "小华";
        request.put("name", name);
        session.put("name", name);
        application.put("name", name);
        return SUCCESS;
    }
}
