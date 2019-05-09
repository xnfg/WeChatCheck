package com.school.wechat.wechatserver.api.base.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.school.wechat.wechatserver.api.base.mapper.MessageMapper;
import com.school.wechat.wechatserver.api.base.model.Message;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;
import com.school.wechat.wechatserver.api.base.model.vo.MessageModel;
import com.school.wechat.wechatserver.api.base.service.MessageService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service("MessageService")
public class MessageServiceImpl implements MessageService {


    @Resource
    MessageMapper messageMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public Message selectByPrimaryKey(Integer id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }

    @Override
    public ResponseResult findMessage(String openID, Integer pageNumber) {
        if(ObjectUtils.isEmpty(pageNumber)){
            pageNumber=1;
        }
        PageHelper.startPage(pageNumber,10);
        List<MessageModel> list = messageMapper.selectMessage(openID);
        PageInfo pageInfo = new PageInfo(list);
        ResponseResult responseResult = new ResponseResult(ResponseResult.SUCCESS,pageNumber, pageInfo.getPages(),pageInfo.getList());
        return responseResult;
    }

    @Override
    public ResponseResult outMessage(String id,String openID) {

        messageMapper.outMessage(id,openID);
        return new ResponseResult(ResponseResult.SUCCESS);
    }
}
