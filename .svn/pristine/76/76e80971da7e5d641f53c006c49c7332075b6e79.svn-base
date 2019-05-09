package com.school.wechat.wechatserver.api.base.service;

import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.StudentJobDetails;

import java.util.List;

public interface StudentJobDetailsService {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增，对象属性不能为空
     * @param record
     * @return
     */
    int insert(StudentJobDetails record);

    /**
     * 新增，对象属性可以空
     * @param record
     * @return
     */
    int insertSelective(StudentJobDetails record);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    StudentJobDetails selectByPrimaryKey(Integer id);

    /**
     * 更新，如果对象属性为空则对应的字段不更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(StudentJobDetails record);

    /**
     * 更新，如果对象的属性为空，则对应的字段也会更新为空
     * @param record
     * @return
     */
    int updateByPrimaryKey(StudentJobDetails record);

    ResponseResult findAll();

    ResponseResult outStudentJobDetails(String id,String openID);
}
