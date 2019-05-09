package com.school.wechat.wechatserver.api.base.mapper;

import com.school.wechat.wechatserver.api.base.model.JobInfo;
import com.school.wechat.wechatserver.api.base.model.vo.JobDetails;
import com.school.wechat.wechatserver.api.base.model.vo.MyJob;
import com.school.wechat.wechatserver.api.base.model.vo.FindJobModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobInfo record);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfo record);

    int updateByPrimaryKey(JobInfo record);

    List<MyJob> findMyJob(@Param("openID") String openID, @Param("status") Integer status);

    JobDetails findByJobDetails(@Param("Id")Integer Id, @Param("openID")String openID);

    JobDetails findByMessage(@Param("Id")Integer Id,@Param("openID")String openID);

    JobDetails findByJobNumber(@Param("Id") Integer Id,@Param("openID")String openID);

    JobInfo findByWorkID(@Param("workID") String workID);

    List<JobInfo> findJob(FindJobModel findJobModel);
}
