package com.school.wechat.wechatserver.api.base.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.school.wechat.wechatserver.util.DateUtil;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;

public class MyJobDetails {
    private String title;
    private Integer job_number;
    private String work_day;
    private String work_time;
    private BigDecimal vip_salary_0;
    private BigDecimal vip_salary_1;
    private String recruit_company;
    private String city;
    private Date enroll_closing_date;
    private Integer need_Number_people;
    private Integer already_existing_people;
    private String sex;
    private String height;
    private Date assemble_time;
    private String assemble_address;
    private Integer enroll_status;
    private Integer show_condition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getJob_number() {
        return job_number;
    }

    public void setJob_number(Integer job_number) {
        this.job_number = job_number;
    }

    public String getWork_day() {
        return work_day;
    }

    public void setWork_day(String work_day) {
        this.work_day = work_day;
    }

    public String getWork_time() {
        return work_time;
    }

    public void setWork_time(String work_time) {
        this.work_time = work_time;
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

    public String getRecruit_company() {
        return recruit_company;
    }

    public void setRecruit_company(String recruit_company) {
        this.recruit_company = recruit_company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getEnroll_closing_date() {
        return enroll_closing_date;
    }

    public void setEnroll_closing_date(Date enroll_closing_date) {
        this.enroll_closing_date = enroll_closing_date;
    }

    public Integer getNeed_Number_people() {
        return need_Number_people;
    }

    public void setNeed_Number_people(Integer need_Number_people) {
        this.need_Number_people = need_Number_people;
    }

    public Integer getAlready_existing_people() {
        return already_existing_people;
    }

    public void setAlready_existing_people(Integer already_existing_people) {
        this.already_existing_people = already_existing_people;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getAssemble_time() {
        return assemble_time;
    }

    public void setAssemble_time(Date assemble_time) {
        this.assemble_time = assemble_time;
    }

    public String getAssemble_address() {
        return assemble_address;
    }

    public void setAssemble_address(String assemble_address) {
        this.assemble_address = assemble_address;
    }

    public Integer getEnroll_status() {
        return enroll_status;
    }

    public void setEnroll_status(Integer enroll_status) {
        this.enroll_status = enroll_status;
    }

    public Integer getShow_condition() {
        return show_condition;
    }

    public void setShow_condition(Integer show_condition) {
        this.show_condition = show_condition;
    }
    public MyJobDetails(){
    }
    public MyJobDetails(JobDetails jobInfo){
        String startDay =" ";
        String stopDay =" ";
        this.title=jobInfo.getTitle();
        this.job_number=jobInfo.getJobNumber();
        if(!StringUtils.isEmpty(jobInfo.getStartWorkDay())) {
            startDay =DateUtil.getDay(jobInfo.getStartWorkDay());
        }
        if(!StringUtils.isEmpty(jobInfo.getStopWorkDay())){
             stopDay = DateUtil.getDay(jobInfo.getStopWorkDay());
        }
        if(startDay.equals(stopDay)){
            this.work_day=startDay;
        }else {
            this.work_day = startDay + "~" + stopDay;
        }
        String startTime = DateUtil.getHM(jobInfo.getStartWorkTime());
        String stopTime = DateUtil.getHM(jobInfo.getStopWorkTime());
        this.work_time=startTime+"~"+stopTime;
        this.vip_salary_0=jobInfo.getVipSalary0();
        this.recruit_company=jobInfo.getRecruitCompany();
        this.city = "长沙";
        this.enroll_closing_date=jobInfo.getEnrollClosingDate();
        this.need_Number_people=jobInfo.getNeedNumberPeople();
        this.already_existing_people=jobInfo.getAlreadyExistingPeople();
        if(ObjectUtils.isEmpty(jobInfo.getSex())||
                (jobInfo.getSex()!=0&&jobInfo.getSex()!=1)){
            this.sex = "不限";
        }else if(jobInfo.getSex()==0) {
            this.sex = "男";
        }else if(jobInfo.getSex()==1){
            this.sex = "女";
        }
        this.height=jobInfo.getHeight();
        this.assemble_time=jobInfo.getAssembleTime();
        this.assemble_address=jobInfo.getAssembleAddress();
        this.enroll_status=jobInfo.getEnrollStatus();
        this.show_condition=jobInfo.getShowCondition();
    }
}
