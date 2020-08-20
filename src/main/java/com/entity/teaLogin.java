package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "tealogin")
public class teaLogin {
    @TableId(value = "username")
    private String username;
    private String password;
    private int shushelou;

    public teaLogin() {
    }

    public teaLogin(String username, String password, int shushelou) {
        this.username = username;
        this.password = password;
        this.shushelou = shushelou;
    }

    @Override
    public String toString() {
        return "teaLogin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", shushelou=" + shushelou +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getShushelou() {
        return shushelou;
    }

    public void setShushelou(int shushelou) {
        this.shushelou = shushelou;
    }

}
