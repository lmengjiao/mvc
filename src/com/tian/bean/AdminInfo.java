package com.tian.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AdminInfo {
    private String adminName;
    //因为前端传过来的参数是字符串 所以这里要做一个注解版
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date AdminTime;
    private String AdminPwd;
    private String AdminPwd1;
    private String adminSex;
    private String admin;
    private String adminCity;
    private String adminSwitch;

    private List<Lover> lover;
    private Integer[] aihao; //1.写代码 2.看书 3.打游戏

    @Override
    public String toString() {
        return "AdminInfo{" +
                "adminName='" + adminName + '\'' +
                ", AdminTime=" + AdminTime +
                ", AdminPwd='" + AdminPwd + '\'' +
                ", AdminPwd1='" + AdminPwd1 + '\'' +
                ", adminSex='" + adminSex + '\'' +
                ", admin='" + admin + '\'' +
                ", adminCity='" + adminCity + '\'' +
                ", adminSwitch='" + adminSwitch + '\'' +
                ", lover=" + lover +
                ", aihao=" + Arrays.toString(aihao) +
                '}';
    }

    public Integer[] getAihao() {
        return aihao;
    }

    public void setAihao(Integer[] aihao) {
        this.aihao = aihao;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Date getAdminTime() {
        return AdminTime;
    }

    public void setAdminTime(Date adminTime) {
        AdminTime = adminTime;
    }

    public String getAdminPwd() {
        return AdminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        AdminPwd = adminPwd;
    }

    public String getAdminPwd1() {
        return AdminPwd1;
    }

    public void setAdminPwd1(String adminPwd1) {
        AdminPwd1 = adminPwd1;
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getAdminCity() {
        return adminCity;
    }

    public void setAdminCity(String adminCity) {
        this.adminCity = adminCity;
    }

    public String getAdminSwitch() {
        return adminSwitch;
    }

    public void setAdminSwitch(String adminSwitch) {
        this.adminSwitch = adminSwitch;
    }

    public List<Lover> getLover() {
        return lover;
    }

    public void setLover(List<Lover> lover) {
        this.lover = lover;
    }
}
