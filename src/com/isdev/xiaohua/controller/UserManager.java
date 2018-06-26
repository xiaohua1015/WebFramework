package com.isdev.xiaohua.controller;

import com.isdev.xiaohua.bean.PrintUserInfo;
import com.isdev.xiaohua.bean.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/6/26.
 */
public class UserManager extends AbstractController {

    private PrintUserInfo printInfo = null;

    public PrintUserInfo getPrintInfo() {
        return printInfo;
    }

    public void setPrintInfo(PrintUserInfo printInfo) {
        this.printInfo = printInfo;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        printInfo.printInfo();
        return null;
    }
}
