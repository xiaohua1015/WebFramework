package com.isdev.xiaohua.dao;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/7/1.
 */
public class TransactionExample {
    DataSource dataSource;
    PlatformTransactionManager transactionManager;
    TransactionTemplate transactionTemplate;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public PlatformTransactionManager getTransactionManager() {
        return transactionManager;
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void transactionOperation() {
        transactionTemplate.execute(new TransactionCallback() {

            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                try {
                    Connection conn = dataSource.getConnection();
                    String sql = "insert into user (username, password) values(?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, "小华");
                    pstmt.setString(2, "123456");
//                    pstmt.executeUpdate();
//                    int a = 9/0;
                    pstmt.setString(1, "小明");
                    pstmt.setString(2, "qwer");
                    pstmt.executeUpdate();
                    pstmt.close();
                    conn.close();
                } catch (Exception e) {
                    transactionManager.rollback(transactionStatus);
                    e.printStackTrace();
                }
                return null;
            }
        });
    }
}
