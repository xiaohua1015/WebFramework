package com.isdev.xiaohua.test;

import com.isdev.xiaohua.bean.Product;
import com.isdev.xiaohua.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Administrator on 2018/6/26.
 */
public class HibernateTest {
    public static void main(String[] args) {
//        addProduct();
        getProduct();
//        delProduct(2);
//        updateProduct();
    }

    private static void addProduct() {
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

    public static Product getProduct () {
        Product product = null;
        Session session = null;
        Session session2 = null;
        try {
            session = HibernateUtil.getSession();
            product = session.get(Product.class, 5);
            System.out.println("product = " + product.toString());
            session2 = HibernateUtil.getSession();
            product = session2.get(Product.class, 5);
            System.out.println("product = " + product.toString());
        } catch (Exception e) {
            System.out.println("对象装在失败");
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession();
        }
        return  product;
    }

    public static void delProduct(int id) {
        Session session = null;
        Product product = null;
        try {
            session = HibernateUtil.getSession();
            product = session.get(Product.class, id);
            if (product != null) {
                session.beginTransaction();
                session.delete(product);
                session.flush();
                session.getTransaction().commit();
                System.out.println("对象" + id + "删除成功");
            } else {
                System.out.println("没有此对象");
            }
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println("对象删除失败");
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public static void updateProduct() {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            Product product = session.get(Product.class, 4);
            if(product != null) {
                session.beginTransaction();
                product.setName("深入浅出欧洲史");
                product.setPrice(73.00);
                session.flush();
                session.getTransaction().commit();
                System.out.println("对象修改成功");
            } else {
                System.out.println("没有此对象");
            }
        } catch (Exception e) {
            System.out.println("对象修改成功");
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
