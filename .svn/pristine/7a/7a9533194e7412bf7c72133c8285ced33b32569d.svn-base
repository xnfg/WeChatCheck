package com.school.wechat.wechatserver.api.base.mapper;

import com.school.wechat.wechatserver.api.base.model.StudentInfo;
import com.school.wechat.wechatserver.api.base.model.vo.LoginModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);

    LoginModel selectByLogin(@Param("openID")String openID);

    StudentInfo findByOpenID(@Param("openID") String openID);
}