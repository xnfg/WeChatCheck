package com.school.wechat.wechatserver.operation;

import com.school.wechat.wechatserver.util.HttpRequest;
import com.school.wechat.wechatserver.util.RedisUtil;
import com.school.wechat.wechatserver.util.properties;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 微信access_token工具类
 * date：2018-8-3 19:48:43
 * author：hjy
 */
public class Tonken {

    private static Logger log = LoggerFactory.getLogger(Tonken.class);


    /**
     * 请求微信接口获取access_token
     */
    public String getToken(RedisUtil redisUtil){

        //读取配置文件的信息
        properties.getConfig().loadPropertiesFromSrc();
        String appid = properties.getConfig().getAppid();
        String secret = properties.getConfig().getAppsecret();
        //发送get请求来获取access_token
        String str = HttpRequest.sendGet("https://api.weixin.qq.com/cgi-bin/token","grant_type=client_credential&appid="+appid+"&secret="+secret);
        JSONObject jsonObject = new JSONObject(str);

        //获取到的access_token和有效时间expires_in
        String access_token = jsonObject.get("access_token").toString();
        int expires_in = Integer.parseInt(jsonObject.get("expires_in").toString());
        //把获取到的值设置到Redis中去
        redisUtil.set("access_token",access_token,expires_in);
        return jsonObject.get("access_token").toString();
    }

    /**
     * 从Redis中获取access_token
     */
    public static String getAccess_token(RedisUtil redisUtil){

        try {
            if(redisUtil.get("access_token")!=null&&redisUtil.get("access_token")!=""){
                return redisUtil.get("access_token");
            }else {
                return new Tonken().getToken(redisUtil);
            }
        }catch (Exception e){
            return new Tonken().getToken(redisUtil);
        }

    }

}
