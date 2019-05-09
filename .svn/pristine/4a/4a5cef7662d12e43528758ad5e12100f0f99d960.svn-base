package com.school.wechat.wechatserver.api.base.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.school.wechat.wechatserver.api.base.mapper.StudentJobDetailsMapper;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.StudentJobDetails;
import com.school.wechat.wechatserver.api.base.service.StudentJobDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("StudentJobDetailsService")
public class StudentJobDetailsServiceImpl implements StudentJobDetailsService {
    @Resource
    StudentJobDetailsMapper student;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return student.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentJobDetails record) {
        return student.insert(record);
    }

    @Override
    public int insertSelective(StudentJobDetails record) {
        return student.insertSelective(record);
    }

    @Override
    public StudentJobDetails selectByPrimaryKey(Integer id) {
        return student.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentJobDetails record) {
        return student.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentJobDetails record) {
        return student.updateByPrimaryKey(record);
    }


    @Override
    public ResponseResult findAll() {
        PageHelper.startPage(1, 2);
        List<StudentJobDetails> list = student.findAll();
        PageInfo pageInfo = new PageInfo(list);
        ResponseResult responseResult = new ResponseResult(ResponseResult.SUCCESS, pageInfo.getPageNum(), pageInfo.getPages(),
                list);
        return responseResult;
    }

    @Override
    public ResponseResult outStudentJobDetails(String id,String openID) {

        student.outStudentJobDetails(id,openID);
        return new ResponseResult(ResponseResult.SUCCESS);
    }


}
