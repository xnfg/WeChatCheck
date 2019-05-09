package com.school.wechat.wechatserver.api.base.service;

import com.school.wechat.wechatserver.api.base.model.Message;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;

public interface MessageService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增，对象属性不能为空
     * @param record
     * @return
     */
    int insert(Message record);

    /**
     *新增，对象属性可以空
     * @param record
     * @return
     */
    int insertSelective(Message record);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Message selectByPrimaryKey(Integer id);

    /**
     * 更新，如果对象属性为空则对应的字段不更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * 更新，如果对象的属性为空，则对应的字段也会更新为空
     * @param record
     * @return
     */
    int updateByPrimaryKey(Message record);

    /**
     * 查询 根据用户的编号获取订单表的详细信息
     * @param openID
     * @param pageNumber
     * @return
     */
    ResponseResult findMessage(String openID,Integer pageNumber);

    ResponseResult outMessage(String id,String openID);

}
