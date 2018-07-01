package com.isdev.xiaohua.dao;

import com.isdev.xiaohua.bean.User;
import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/7/1.
 */
public class UserDAOSupport extends HibernateDaoSupport {

    @Transactional
    public void insert(User user) {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
//        hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        hibernateTemplate.save(user);
    }
}
