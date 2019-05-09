package com.school.wechat.wechatserver.api.base.mapper;

import com.school.wechat.wechatserver.api.base.model.OderDetails;
import com.school.wechat.wechatserver.api.base.model.vo.MyWallerModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OderDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OderDetails record);

    int insertSelective(OderDetails record);

    OderDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OderDetails record);

    int updateByPrimaryKey(OderDetails record);

    List<MyWallerModel> findWalletDetails(@Param("openID") String openID);

    void outOderDetails(String id, String openID);

}