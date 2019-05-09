package com.school.wechat.wechatserver.api.base.model.vo;

import com.school.wechat.wechatserver.api.base.model.StudentInfo;

import java.util.Date;

public class RegisterModel {
    private String openID;
    private String phone;
    private String name;
    private String sex;
    private String age;
    private String height;
    private String school;
    private String avatarUrl;
    private String nickname;
    public String getOpenID() {
        return openID;
    }

    public void setOpenID(String openID) {
        this.openID = openID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public static StudentInfo register(RegisterModel registerModel){
        StudentInfo student = new StudentInfo();
        student.setStudentNumber(registerModel.getOpenID());
        student.setPhoneNumber(registerModel.getPhone());
        student.setStudentName(registerModel.getName());
        student.setSex(Integer.valueOf(registerModel.getSex()));
        student.setAge(Integer.valueOf(registerModel.getAge()));
        student.setHeight(Integer.valueOf(registerModel.getHeight()));
        student.setSchool(registerModel.getSchool());
        student.setNickname(registerModel.getNickname());
        student.setCreateTime(new Date());
        student.setVipRank(0);
        student.setHeadPortrait(registerModel.getAvatarUrl());
        student.setOpenMember(0);
        student.setReputationIntegral(100);
        return student;
    }
}
