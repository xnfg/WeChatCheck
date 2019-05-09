package com.school.wechat.wechatserver.api.base.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.school.wechat.wechatserver.api.base.mapper.JobInfoMapper;
import com.school.wechat.wechatserver.api.base.mapper.StudentJobDetailsMapper;
import com.school.wechat.wechatserver.api.base.model.JobInfo;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.StudentJobDetails;
import com.school.wechat.wechatserver.api.base.model.vo.*;
import com.school.wechat.wechatserver.api.base.service.JobInfoService;
import com.school.wechat.wechatserver.util.ObjectIsNullUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service("JobInfoService")
public class JobInfoServiceImpl implements JobInfoService {
    @Resource
    JobInfoMapper JobInfoMapper;

    @Resource
    StudentJobDetailsMapper jobDetailsMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return JobInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(JobInfo record) {
        return JobInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(JobInfo record) {
        return JobInfoMapper.insertSelective(record);
    }

    @Override
    public JobInfo selectByPrimaryKey(Integer id) {
        return JobInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JobInfo record) {
        return JobInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(JobInfo record) {
        return JobInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResponseResult findMyJob(String openID, Integer status, Integer pageNumber) {
        if(ObjectUtils.isEmpty(pageNumber)){
            pageNumber=1;
        }
            PageHelper.startPage(pageNumber,10);
            List<MyJob> myJob = JobInfoMapper.findMyJob(openID, status);
            if(ObjectUtils.isEmpty(myJob)){
                return new ResponseResult(ResponseResult.ERROR);
            }else {
                PageInfo info = new PageInfo(myJob);
                ResponseResult result = new ResponseResult(ResponseResult.SUCCESS, pageNumber, info.getPages(), myJob);
                return result;
            }
    }

    @Override
    public ResponseResult findMyJobDetails(String openID, Integer type, Integer id) {
        if(ObjectUtils.isEmpty(type)||ObjectUtils.isEmpty(openID)
                ||ObjectUtils.isEmpty(id)){
            return new ResponseResult(ResponseResult.ERROR);
        }else {
            JobDetails info;
            if(type==1){
                 info = JobInfoMapper.findByJobDetails(id, openID);
            }else if(type==2){
                 info = JobInfoMapper.findByMessage(id, openID);
            }else if(type==3){
                 info = JobInfoMapper.findByJobNumber(id,openID);
            }else {
                return new ResponseResult(ResponseResult.ERROR);
            }
            if(ObjectUtils.isEmpty(info)){
                return new ResponseResult(ResponseResult.ERROR);
            }else {
                return new ResponseResult(ResponseResult.SUCCESS,new MyJobDetails(info));
            }
        }
    }

    @Override
    public ResponseResult apply(String openID, String workID) {
        JobInfo job = JobInfoMapper.findByWorkID(workID);
        if(StringUtils.isEmpty(openID)||openID.length()!=28){
            return new ResponseResult(ResponseResult.ERROR);
        }else {
            if (ObjectUtils.isEmpty(job)) {
                return new ResponseResult(ResponseResult.ERROR);
            } else {
                //报名人数已满
                if(ObjectUtils.isEmpty(job.getNeedNumberPeople())
                   ||ObjectUtils.isEmpty(job.getAlreadyExistingPeople())
                   ||job.getNeedNumberPeople()==job.getAlreadyExistingPeople()){
                    return new ResponseResult(ResponseResult.ERROR);
                }else {
                    StudentJobDetails jobDetails = new StudentJobDetails();
                    jobDetails.setJobNumber(job.getJobNumber());
                    jobDetails.setJobStatus(0);
                    jobDetails.setShow(1);
                    jobDetails.setStartWorkTime(job.getStartWorkTime());
                    jobDetails.setEnrollStatus(1);
                    jobDetails.setStudentNumber(openID);
                    jobDetailsMapper.insertSelective(jobDetails);
                    return new ResponseResult(ResponseResult.SUCCESS);
                }
            }
        }
  }

    @Override
    public ResponseResult getJobList(JobInfoParam jobInfoParam) throws Exception{
        FindJobModel findJobModel = new FindJobModel();
        if(ObjectUtils.isEmpty(jobInfoParam)
                ||!ObjectIsNullUtil.isAllFieldNull(jobInfoParam)){
            return new ResponseResult(ResponseResult.ERROR);
        }else {
            List<JobList> list = new ArrayList<>();
            //金额
            if("0".equals(jobInfoParam.getMoneyType())){
                findJobModel.setVipMin0(new BigDecimal(0));
                findJobModel.setVipMin1(new BigDecimal(0));
                findJobModel.setVipMax0(new BigDecimal(50));
                findJobModel.setVipMax1(new BigDecimal(50));
            }else if("1".equals(jobInfoParam.getMoneyType())){
                findJobModel.setVipMin0(new BigDecimal(50));
                findJobModel.setVipMin1(new BigDecimal(50));
                findJobModel.setVipMax0(new BigDecimal(100));
                findJobModel.setVipMax1(new BigDecimal(100));
            }else if("2".equals(jobInfoParam.getMoneyType())){
                findJobModel.setVipMin0(new BigDecimal(100));
                findJobModel.setVipMin1(new BigDecimal(100));
            }
            //用户类别
            if("0".equals(jobInfoParam.getWorkType())){
                findJobModel.setShowCondition(0);
                findJobModel.setVipMax1(null);
                findJobModel.setVipMin1(null);
            }else {
                findJobModel.setShowCondition(1);
                findJobModel.setVipMax0(null);
                findJobModel.setVipMin0(null);
            }
            //年龄
            if("0".equals(jobInfoParam.getAgeType())){
                findJobModel.setAgeMin(0);
                findJobModel.setAgeMax(18);
            }else if("1".equals(jobInfoParam.getAgeType())){
                findJobModel.setAgeMin(18);
            }
            else if("2".equals(jobInfoParam.getAgeType())){
                findJobModel.setAgeMin(null);
                findJobModel.setAgeMax(null);
            }
            //性别
            if("0".equals(jobInfoParam.getSexType())){
                findJobModel.setSex(0);
            }else if("1".equals(jobInfoParam.getSexType())){
                findJobModel.setSex(1);
            }else if("2".equals(jobInfoParam.getSexType())){
                findJobModel.setSex(null);
            }
            PageHelper.startPage(jobInfoParam.getPageNumber(),10);
            List<JobInfo> job = JobInfoMapper.findJob(findJobModel);
            PageInfo info = new PageInfo(job);
            if(ObjectUtils.isEmpty(job)){
                return new ResponseResult(ResponseResult.ERROR);
            }else {
                for (JobInfo item : job) {
                    list.add(new JobList(item));
                }
                int pageNum = info.getPageNum();
                int pages = info.getPages();
                return new ResponseResult(ResponseResult.SUCCESS, pageNum,pages,list);
            }

        }

    }


}
