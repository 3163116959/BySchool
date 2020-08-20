package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "stulogin")
public class stuLogin {
    @TableId(value = "stuId")
    private String stuId;
    private String stuPass;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuPass() {
        return stuPass;
    }

    public void setStuPass(String stuPass) {
        this.stuPass = stuPass;
    }

    public stuLogin() {
    }

    public stuLogin(String stuId, String stuPass) {
        this.stuId = stuId;
        this.stuPass = stuPass;
    }

    @Override
    public String toString() {
        return "stuLogin{" +
                "stuId='" + stuId + '\'' +
                ", stuPass='" + stuPass + '\'' +
                '}';
    }


}
