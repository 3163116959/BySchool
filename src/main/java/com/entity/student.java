package com.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "stu")
public class student {
    @TableId(value = "stuId")
    private String stuId;
    private String stuName;
    private String stuSex;
    private String stuClass;
    @TableLogic
    private int stuDele;
    private int stuSushel;
    private int stuSusheh;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public int getStuDele() {
        return stuDele;
    }

    public void setStuDele(int stuDele) {
        this.stuDele = stuDele;
    }

    public int getStuSushel() {
        return stuSushel;
    }

    public void setStuSushel(int stuSushel) {
        this.stuSushel = stuSushel;
    }

    public int getStuSusheh() {
        return stuSusheh;
    }

    public void setStuSusheh(int stuSusheh) {
        this.stuSusheh = stuSusheh;
    }

    public student(){
    }

    public student(String stuId, String stuName, String stuSex, String stuClass, int stuDele, int stuSushel, int stuSusheh) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuClass = stuClass;
        this.stuDele = stuDele;
        this.stuSushel = stuSushel;
        this.stuSusheh = stuSusheh;
    }

    @Override
    public String toString() {
        return "student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuClass='" + stuClass + '\'' +
                ", stuDele=" + stuDele +
                ", stuSushel=" + stuSushel +
                ", stuSusheh=" + stuSusheh +
                '}';
    }
}
