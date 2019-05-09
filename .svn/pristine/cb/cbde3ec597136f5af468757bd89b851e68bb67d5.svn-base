package com.school.wechat.wechatserver.api.base.controller;

import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.service.MessageService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v2/msg")
public class MessageController {

    @Resource
    MessageService messageService;
    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public ResponseResult details (String openID,Integer pageNumber){
        try{
         return  messageService.findMessage(openID, pageNumber);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseResult(ResponseResult.ERROR);
        }

    }
}
