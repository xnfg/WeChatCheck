package com.school.wechat.wechatserver.api.base.controller;

import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v2/index")
public class HomePageController {

    @RequestMapping(value = "/imgs",method = RequestMethod.GET)
    public ResponseResult index(){
        try {
            List<String> list = new ArrayList<>();
            String img1= "http://www.fy2018.online/images/wechar/timg.jpg";
            String img2= "http://www.fy2018.online/images/wechar/timg1.jpg";
            String img3= "http://www.fy2018.online/images/wechar/timg2.jpg";
            list.add(img1);
            list.add(img2);
            list.add(img3);
        return new ResponseResult(ResponseResult.SUCCESS,list);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseResult(ResponseResult.ERROR);
        }

    }

}
