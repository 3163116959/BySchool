package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "super")
public class superPa {
   @TableId(value = "username")
    private String username;
    private String passowrd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public superPa() {
    }

    public superPa(String username, String passowrd) {
        this.username = username;
        this.passowrd = passowrd;
    }

    @Override
    public String toString() {
        return "superPa{" +
                "username='" + username + '\'' +
                ", passowrd='" + passowrd + '\'' +
                '}';
    }

}
