package com.school.wechat.wechatserver.api.base.mapper;

import com.school.wechat.wechatserver.api.base.model.Message;
import com.school.wechat.wechatserver.api.base.model.vo.MessageModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<MessageModel> selectMessage(String openID);

    void outMessage(String id,String openID);
}
