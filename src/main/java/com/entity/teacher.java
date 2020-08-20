package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "teachers")
public class teacher {
    @TableId(value = "teaId")
    private String teaId;
    private String teaName;
    private String teaTeach;
    @TableLogic(value = "deleted")
    private int deleted;

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaTeach() {
        return teaTeach;
    }

    public void setTeaTeach(String teaTeach) {
        this.teaTeach = teaTeach;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public teacher() {
    }

    public teacher(String teaId, String teaName, String teaTeach, int deleted) {
        this.teaId = teaId;
        this.teaName = teaName;
        this.teaTeach = teaTeach;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "teaId='" + teaId + '\'' +
                ", teaName='" + teaName + '\'' +
                ", teaTeach='" + teaTeach + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
