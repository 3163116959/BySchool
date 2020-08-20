package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "sushe")
public class suShe {
    @TableId(value = "username")
    private String username;
    private String password;
    private int sushelou;

    public suShe() {
    }

    public suShe(String username, String password, int sushelou) {
        this.username = username;
        this.password = password;
        this.sushelou = sushelou;
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

    public int getSushelou() {
        return sushelou;
    }

    public void setSushelou(int sushelou) {
        this.sushelou = sushelou;
    }

    @Override
    public String toString() {
        return "suShe{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sushelou=" + sushelou +
                '}';
    }

}
