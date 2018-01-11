package com.spring.back.dao;

import com.spring.back.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by XiuYin.Cui on 2018/1/9.
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUser() {
        User user = jdbcTemplate.queryForObject("select * from yy_system_user", new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return new User(
                        resultSet.getString("uuid"),
                        resultSet.getString("name"),
                        resultSet.getString("password")
                );
            }
        });
        if (user != null) {
            return user;
        }
        return null;
    }
}
