package com.isdev.xiaohua.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrator on 2018/6/26.
 */
public class HibernateUtil {
    private  static final ThreadLocal<Session> threadLocal = new ThreadLocal<>();
    private static SessionFactory sessionFactory = null;

    static {
        try {
            Configuration cfg = new Configuration().configure();
            sessionFactory = cfg.buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println("创建会话工厂失败");
            e.printStackTrace();
        }
    }

    //获取session
    public static Session getSession() {
//        Session session = threadLocal.get();
        Session session = null;
        if(session == null || !session.isOpen()) {
            if (sessionFactory == null) {
                rebuildSessionFactory();
            }
            session = (sessionFactory != null) ? sessionFactory.openSession(): null;
//            threadLocal.set(session);
        }
        return session;
    }

    //重新创建会话工厂
    public static void rebuildSessionFactory() {
        try {
            Configuration cfg = new Configuration().configure();
            sessionFactory = cfg.buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println("创建会话工厂失败");
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //关闭session
    public static void closeSession() {
        Session session = threadLocal.get();
        threadLocal.set(null);
        if (session != null) {
            session.close();
        }
    }
}
