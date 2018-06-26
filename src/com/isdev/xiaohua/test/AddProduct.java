package com.isdev.xiaohua.test;

import com.isdev.xiaohua.bean.Product;
import com.isdev.xiaohua.utils.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by Administrator on 2018/6/26.
 */
public class AddProduct {
    public static void main(String[] args) {
        Session session = null;
        Product product = new Product();
        product.setName("深入浅出nodejs");
        product.setPrice(79.10);
        product.setFactory("人民教育");
        product.setRemark("买来没看过");
        //Hibernate 的持久化操作
        session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println("数据添加失败");
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession();
        }
    }
}
