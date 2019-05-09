package com.school.wechat.wechatserver.api.base.service;

import com.school.wechat.wechatserver.api.base.model.OderDetails;
import com.school.wechat.wechatserver.api.base.model.ResponseResult;

public interface OrderDetailsService {
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
    int insert(OderDetails record);

    /**
     *新增，对象属性可以空
     * @param record
     * @return
     */
    int insertSelective(OderDetails record);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    OderDetails selectByPrimaryKey(Integer id);

    /**
     * 更新，如果对象属性为空则对应的字段不更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(OderDetails record);

    /**
     * 更新，如果对象的属性为空，则对应的字段也会更新为空
     * @param record
     * @return
     */
    int updateByPrimaryKey(OderDetails record);

    ResponseResult findWalletDetails(String openID,Integer pageNumber);


    ResponseResult outOrderDetails(String id, String openID);
}
