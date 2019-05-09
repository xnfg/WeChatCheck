package com.school.wechat.wechatserver.api.base.controller;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.vo.RegisterModel;
import com.school.wechat.wechatserver.api.base.service.StudentInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/v2/user")
public class StudentController {

    @Resource
    StudentInfoService studentInfoService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResponseResult login(String openID){
        try {
            if(StringUtils.isNotEmpty(openID)&&openID.length()==28) {
                return studentInfoService.loginFind(openID);
            }else {
                return  new ResponseResult(ResponseResult.ERROR);
            }
        }catch (Exception e){
            e.printStackTrace();
            return  new ResponseResult(ResponseResult.ERROR);
        }
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ResponseResult register(RegisterModel registerModel){
        try {
            return studentInfoService.register(registerModel);
        }catch (Exception e){
            e.printStackTrace();
            return  new ResponseResult(ResponseResult.ERROR);
        }
    }


}
