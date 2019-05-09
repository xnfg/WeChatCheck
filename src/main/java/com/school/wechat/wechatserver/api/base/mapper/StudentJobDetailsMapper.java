package com.school.wechat.wechatserver.api.base.mapper;

import com.school.wechat.wechatserver.api.base.model.StudentJobDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentJobDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentJobDetails record);

    int insertSelective(StudentJobDetails record);

    StudentJobDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentJobDetails record);

    int updateByPrimaryKey(StudentJobDetails record);

    List<StudentJobDetails> findAll();

    void outStudentJobDetails(String id,String openID);
}