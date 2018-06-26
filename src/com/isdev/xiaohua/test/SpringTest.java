package com.isdev.xiaohua.test;

import com.isdev.xiaohua.bean.User;
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
//        ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
        Resource resource = new ClassPathResource("springmvc.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        User user = (User) beanFactory.getBean("user");
//        user.setName("xiaoha");
//        user.setId(1);
        System.out.println(user.toString());
    }
}
