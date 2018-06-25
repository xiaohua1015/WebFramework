package com.isdev.xiaohua.action;

import com.isdev.xiaohua.bean.Soldier;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Administrator on 2018/6/22.
 */
public class OGNLAction extends ActionSupport {

    private String name;
    private Soldier soldier;
//    private Map<String, Object> request;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Soldier getSoldier() {
        return soldier;
    }

    public void setSoldier(Soldier soldier) {
        this.soldier = soldier;
    }

    public OGNLAction() {
//        request = (Map<String, Object>) ActionContext.getContext().get("request");
        name = "汤姆";
        soldier = new Soldier();
        soldier.setId(1);
        soldier.setName("华仔");
    }

    @Override
    public String execute() throws Exception {
//        request.put("info", "request 测试");
        return SUCCESS;
    }
}
