package com.school.wechat.wechatserver.api.base.model.vo;

import com.school.wechat.wechatserver.api.base.model.JobInfo;
import com.school.wechat.wechatserver.util.Area;

import java.math.BigDecimal;

public class JobList {
    private String title;
    private String remarks;
    private BigDecimal vip_salary_0;
    private BigDecimal vip_salary_1;
    private String city;
    private String area;
    private Integer sex;
    private Integer workId;
    private Integer isvip;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getVip_salary_0() {
        return vip_salary_0;
    }

    public void setVip_salary_0(BigDecimal vip_salary_0) {
        this.vip_salary_0 = vip_salary_0;
    }

    public BigDecimal getVip_salary_1() {
        return vip_salary_1;
    }

    public void setVip_salary_1(BigDecimal vip_salary_1) {
        this.vip_salary_1 = vip_salary_1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    public JobList(){

    }

    public JobList(JobInfo jobInfo){
        this.title=jobInfo.getTitle();
        this.remarks=jobInfo.getRemarks();
        this.vip_salary_0=jobInfo.getVipSalary0();
        this.vip_salary_1=jobInfo.getVipSalary1();
        this.city="长沙";
        this.area= Area.getArea(jobInfo.getArea());
        this.sex=jobInfo.getSex();
        this.workId=jobInfo.getJobNumber();
        this.isvip =jobInfo.getShowCondition();
    }
}
