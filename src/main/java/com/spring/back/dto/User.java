package com.spring.back.dto;

/**
 * Created by XiuYin.Cui on 2018/1/9.
 */
public class User {

    private String uuid;
    private String userName;
    private String password;

    public User() {

    }

    public User(String uuid, String userName, String password) {
        this.uuid = uuid;
        this.userName = userName;
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
