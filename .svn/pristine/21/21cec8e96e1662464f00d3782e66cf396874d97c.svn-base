package com.school.wechat.wechatserver.api.base.service;

import com.school.wechat.wechatserver.api.base.model.JobInfo;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.vo.JobInfoParam;

/**
 * 兼职信息表对应的service
 */
public interface JobInfoService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增，对象属性不能空
     * @param record
     * @return
     */
    int insert(JobInfo record);

    /**
     * 新增，对象属性可以空
     * @param record
     * @return
     */
    int insertSelective(JobInfo record);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    JobInfo selectByPrimaryKey(Integer id);

    /**
     * 更新，如果对象属性为空则对应的字段不更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(JobInfo record);

    /**
     * 更新，如果对象的属性为空，则对应的字段也会更新为空
     * @param record
     * @return
     */
    int updateByPrimaryKey(JobInfo record);

    /**
     * 作者：zyd
     * 查询我的兼职
     * @param openID 用户id
     * @param status 状态0.进行中的兼职 1.已完成的兼职
     * @param pageNumber 当前页码
     * @return
     */
    ResponseResult findMyJob(String openID, Integer status, Integer pageNumber);

    ResponseResult findMyJobDetails(String openID,Integer type,Integer id);

    /**
     * 作者：zyd
     * 报名
     * @return
     */
    ResponseResult apply(String openID,String workID);

    /**
     * 获取兼职列表
     * @return
     */
    ResponseResult getJobList (JobInfoParam jobInfoParam)throws Exception;
}
