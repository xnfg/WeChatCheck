package com.school.wechat.wechatserver.api.base.service.impl;

import com.school.wechat.wechatserver.api.base.mapper.StudentInfoMapper;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.StudentInfo;
import com.school.wechat.wechatserver.api.base.model.vo.LoginModel;
import com.school.wechat.wechatserver.api.base.model.vo.RegisterModel;
import com.school.wechat.wechatserver.api.base.service.StudentInfoService;
import com.school.wechat.wechatserver.util.DataCheckUtil;
import com.school.wechat.wechatserver.util.ObjectIsNullUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service("StudentInfoService")
public class StudentInfoServiceImpl implements StudentInfoService {

    @Resource
    StudentInfoMapper studentInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentInfo record) {
        return studentInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentInfo record) {
        return studentInfoMapper.insertSelective(record);
    }

    @Override
    public StudentInfo selectByPrimaryKey(Integer id) {
        return studentInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentInfo record) {
        return studentInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentInfo record) {
        return studentInfoMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 登录查询
     * @param openID
     * @return
     */
    @Override
    public ResponseResult loginFind(String openID) {
        if(StringUtils.isEmpty(openID)){
            return new ResponseResult(ResponseResult.ERROR);
        }
        LoginModel studentInfo = studentInfoMapper.selectByLogin(openID);
        if(ObjectUtils.isEmpty(studentInfo)){
            return  new ResponseResult(ResponseResult.ERROR);
        }else {
            if("0".equals(studentInfo.getSex())){
                studentInfo.setSex("女");
            }else if("1".equals(studentInfo.getSex())){
                studentInfo.setSex("男");
            }
            return  new ResponseResult(ResponseResult.SUCCESS,studentInfo);
        }

    }

    @Override
    public ResponseResult register(RegisterModel registerModel) throws Exception{

            if(ObjectUtils.isEmpty(registerModel)
                    ||!ObjectIsNullUtil.isAllFieldNull(registerModel)
                    ||!DataCheckUtil.isPhone(registerModel.getPhone())
                    ||("0".equals(registerModel.getSex())
                    ||"1".equals(registerModel.getSex()))){
                return new ResponseResult(ResponseResult.ERROR);
            }else {
                StudentInfo studentInfo = studentInfoMapper.findByOpenID(registerModel.getOpenID());
                if(ObjectUtils.isEmpty(studentInfo)){
                    studentInfoMapper.insertSelective(RegisterModel.register(registerModel));
                    return new ResponseResult(ResponseResult.SUCCESS);
                }else {
                    return new ResponseResult(ResponseResult.ERROR);
                }
            }
    }

}
