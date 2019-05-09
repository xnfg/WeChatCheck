package com.school.wechat.wechatserver.api.base.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class StudentInfo {
    private Integer id;

    private String studentNumber;

    private Integer vipRank;

    private Date createTime;

    private String headPortrait;

    private String nickname;

    private String studentName;

    private Integer sex;

    private Integer age;

    private Integer height;

    private String phoneNumber;

    private String school;

    private Integer reputationIntegral;

    private Integer openMember;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber == null ? null : studentNumber.trim();
    }

    public Integer getVipRank() {
        return vipRank;
    }

    public void setVipRank(Integer vipRank) {
        this.vipRank = vipRank;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public Integer getReputationIntegral() {
        return reputationIntegral;
    }

    public void setReputationIntegral(Integer reputationIntegral) {
        this.reputationIntegral = reputationIntegral;
    }

    public Integer getOpenMember() {
        return openMember;
    }

    public void setOpenMember(Integer openMember) {
        this.openMember = openMember;
    }

    public StudentInfo(){
        this.setVipRank(0);
        this.setOpenMember(0);
    }
}