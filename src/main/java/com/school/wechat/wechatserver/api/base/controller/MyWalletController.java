package com.school.wechat.wechatserver.api.base.controller;

import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.service.OrderDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v2/money")
public class MyWalletController {


    @Resource
    OrderDetailsService orderService;
    @RequestMapping(value = "/details",method = RequestMethod.GET)
    public ResponseResult details(String openID,Integer pageNumber){
        try {
            return  orderService.findWalletDetails(openID,pageNumber);
            }catch (Exception e){
            e.printStackTrace();
            return new ResponseResult(ResponseResult.ERROR);
        }
    }
}
