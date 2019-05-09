package com.school.wechat.wechatserver.api.base.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.school.wechat.wechatserver.api.base.mapper.OderDetailsMapper;
import com.school.wechat.wechatserver.api.base.model.OderDetails;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.vo.MyWallerModel;

import com.school.wechat.wechatserver.api.base.service.OrderDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service("OrderDetails")
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Resource
    OderDetailsMapper oderDetailsMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return oderDetailsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OderDetails record) {
        return oderDetailsMapper.insert(record);
    }

    @Override
    public int insertSelective(OderDetails record) {
        return oderDetailsMapper.insertSelective(record);
    }

    @Override
    public OderDetails selectByPrimaryKey(Integer id) {
        return oderDetailsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OderDetails record) {
        return oderDetailsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OderDetails record) {
        return oderDetailsMapper.updateByPrimaryKey(record);
    }


    @Override
    public ResponseResult findWalletDetails(String openID,Integer pageNumber) {
        if(ObjectUtils.isEmpty(pageNumber)) {
            pageNumber = 1;
        }
        PageHelper.startPage(pageNumber,10);
        List<MyWallerModel> walletDetails = oderDetailsMapper.findWalletDetails(openID);
        PageInfo info = new PageInfo(walletDetails);
        if(ObjectUtils.isEmpty(walletDetails)){
            return new ResponseResult(ResponseResult.ERROR);
        } else {
            return new ResponseResult(ResponseResult.SUCCESS,info.getPageNum(),info.getPages(),walletDetails);
        }
    }

    @Override
    public ResponseResult outOrderDetails(String id,String openID){

        oderDetailsMapper.outOderDetails(id,openID);
        return new ResponseResult(ResponseResult.SUCCESS);
    }

}
