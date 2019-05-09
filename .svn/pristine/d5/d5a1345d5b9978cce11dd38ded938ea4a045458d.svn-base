package com.school.wechat.wechatserver.api.base.controller;

import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.vo.JobInfoParam;
import com.school.wechat.wechatserver.api.base.service.JobInfoService;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v2/job")
public class JobController {

    @Resource
    JobInfoService jobInfoService;

    @GetMapping("/details")
    public ResponseResult details(String openID,Integer status,Integer pageNumber){
        try {
            return jobInfoService.findMyJob(openID,status,pageNumber);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseResult(ResponseResult.ERROR);
        }

    }
    @RequestMapping(value = "/explain",method = RequestMethod.GET)
    public ResponseResult explain(String openID,Integer type,Integer id){
        try {
            ResponseResult result = jobInfoService.findMyJobDetails(openID, type, id);
            if (ObjectUtils.isEmpty(result)){
                return new ResponseResult(ResponseResult.ERROR);
            }else {
                return result;
            }
        }catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult(ResponseResult.ERROR);
        }
    }

    @RequestMapping(value = "/apply",method = RequestMethod.GET)
    public ResponseResult apply(String openID,String workID){
        try {
            return  jobInfoService.apply(openID,workID);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseResult(ResponseResult.ERROR);
        }
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseResult list(JobInfoParam jobInfoParam){

        try {
           return jobInfoService.getJobList(jobInfoParam);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseResult(ResponseResult.ERROR);
        }

    }
}
