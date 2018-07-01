package com.isdev.xiaohua.test;

import com.isdev.xiaohua.bean.PrintUserInfo;
import com.isdev.xiaohua.bean.User;
import com.isdev.xiaohua.dao.TransactionExample;
import com.isdev.xiaohua.dao.UserDAO;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by Administrator on 2018/6/26.
 */
public class SpringTest {

    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("springmvc.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        User user = (User) beanFactory.getBean("user");
//        user.setName("xiaoha");
//        user.setId(1);
        ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
        User user = (User) context.getBean("user");
//        PrintUserInfo printUserInfo = (PrintUserInfo) context.getBean("printUserInfo");
//        printUserInfo.printInfo();
        System.out.println(user.toString());
//        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
//        userDAO.insertUser(user);
        TransactionExample transactionExample = (TransactionExample) context.getBean("transactionExample");
        transactionExample.transactionOperation();
    }
}
