package com.school.wechat.wechatserver.api.base.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class JobInfo {
    private Integer id;

    private Integer jobNumber;

    private Integer age;

    private Integer sex;

    private BigDecimal vipSalary0;

    private BigDecimal vipSalary1;

    private String title;

    private String remarks;

    private Integer city;

    private Integer area;

    private Date startWorkDay;

    private Date stopWorkDay;

    private Date startWorkTime;

    private Date stopWorkTime;

    private String recruitCompany;

    private Date enrollClosingDate;

    private Integer needNumberPeople;

    private Integer alreadyExistingPeople;

    private String height;

    private Date assembleTime;

    private String assembleAddress;

    private Integer showCondition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Integer jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public BigDecimal getVipSalary0() {
        return vipSalary0;
    }

    public void setVipSalary0(BigDecimal vipSalary0) {
        this.vipSalary0 = vipSalary0;
    }

    public BigDecimal getVipSalary1() {
        return vipSalary1;
    }

    public void setVipSalary1(BigDecimal vipSalary1) {
        this.vipSalary1 = vipSalary1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getStartWorkDay() {
        return startWorkDay;
    }

    public void setStartWorkDay(Date startWorkDay) {
        this.startWorkDay = startWorkDay;
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getStopWorkDay() {
        return stopWorkDay;
    }

    public void setStopWorkDay(Date stopWorkDay) {
        this.stopWorkDay = stopWorkDay;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getStartWorkTime() {
        return startWorkTime;
    }

    public void setStartWorkTime(Date startWorkTime) {
        this.startWorkTime = startWorkTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getStopWorkTime() {
        return stopWorkTime;
    }

    public void setStopWorkTime(Date stopWorkTime) {
        this.stopWorkTime = stopWorkTime;
    }

    public String getRecruitCompany() {
        return recruitCompany;
    }

    public void setRecruitCompany(String recruitCompany) {
        this.recruitCompany = recruitCompany == null ? null : recruitCompany.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH")
    public Date getEnrollClosingDate() {
        return enrollClosingDate;
    }

    public void setEnrollClosingDate(Date enrollClosingDate) {
        this.enrollClosingDate = enrollClosingDate;
    }

    public Integer getNeedNumberPeople() {
        return needNumberPeople;
    }

    public void setNeedNumberPeople(Integer needNumberPeople) {
        this.needNumberPeople = needNumberPeople;
    }

    public Integer getAlreadyExistingPeople() {
        return alreadyExistingPeople;
    }

    public void setAlreadyExistingPeople(Integer alreadyExistingPeople) {
        this.alreadyExistingPeople = alreadyExistingPeople;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public Date getAssembleTime() {
        return assembleTime;
    }

    public void setAssembleTime(Date assembleTime) {
        this.assembleTime = assembleTime;
    }

    public String getAssembleAddress() {
        return assembleAddress;
    }

    public void setAssembleAddress(String assembleAddress) {
        this.assembleAddress = assembleAddress == null ? null : assembleAddress.trim();
    }

    public Integer getShowCondition() {
        return showCondition;
    }

    public void setShowCondition(Integer showCondition) {
        this.showCondition = showCondition;
    }
}