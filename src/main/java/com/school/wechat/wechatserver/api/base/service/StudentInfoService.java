package com.school.wechat.wechatserver.api.base.service;


import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.StudentInfo;
import com.school.wechat.wechatserver.api.base.model.vo.LoginModel;
import com.school.wechat.wechatserver.api.base.model.vo.RegisterModel;

import java.util.Map;

public interface StudentInfoService{
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
    int insert(StudentInfo record);

    /**
     *新增，对象属性可以空
     * @param record
     * @return
     */
    int insertSelective(StudentInfo record);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    StudentInfo selectByPrimaryKey(Integer id);

    /**
     * 更新，如果对象属性为空则对应的字段不更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(StudentInfo record);

    /**
     * 更新，如果对象的属性为空，则对应的字段也会更新为空
     * @param record
     * @return
     */
    int updateByPrimaryKey(StudentInfo record);

    /**
     * 登入查询是否已注册
     * @param openID
     * @return
     */
    ResponseResult loginFind(String openID);

    /**
     * 注册
     * @param registerModel
     * @return
     */
    ResponseResult register(RegisterModel registerModel) throws Exception;
}
