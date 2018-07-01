package com.isdev.xiaohua.dao.implement;

import com.isdev.xiaohua.bean.User;
import com.isdev.xiaohua.dao.UserDAO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Administrator on 2018/7/1.
 */
public class UserDAOImpl implements UserDAO {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insertUser(User user) {
        int userId = user.getId();
        String userName = user.getName();
        String password = user.getPassword();
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = dataSource.getConnection();
//            String sql = "insert into user (id, username, password) values(?, ?, ?)";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1, userId);
//            pstmt.setString(2, userName);
//            pstmt.setString(3, password);
            String sql = "insert into user (username, password) values(?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
