package com.school.wechat.wechatserver.api.base.controller;

import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.service.MessageService;
import com.school.wechat.wechatserver.api.base.service.OrderDetailsService;
import com.school.wechat.wechatserver.api.base.service.StudentJobDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v2/del")
public class DelController{

    @Resource
    MessageService messageService;
    @Resource
    OrderDetailsService orderDetailsService;
    @Resource
    StudentJobDetailsService studentJobDetailsService;
    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public ResponseResult details (String type,String openID,String id){

        try {
            if ("1".equals(type)) {
                messageService.outMessage(id, openID);
            } else if ("2".equals(type)) {
                orderDetailsService.outOrderDetails(id, openID);
            } else if ("3".equals(type)) {
                studentJobDetailsService.outStudentJobDetails(id, openID);
            }
            return new ResponseResult(ResponseResult.SUCCESS);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseResult(ResponseResult.ERROR);
        }

    }
}
