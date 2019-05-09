package com.school.wechat.wechatserver.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * 微信认证服务器工具类
 * data:2018-8-3 18:23:30
 * author：hjy
 */
public class CheckUtil {


    /**
     * 将微信的三个参数进行排序，生成字符串，加密处理，并进行验证的的方法
     * @param signature     签名
     * @param timestamp     时间戳
     * @param nonce         随机数
     * @return
     */
    public static boolean checkSignature(String signature,String timestamp,String nonce){

        //读取配置文件的信息
        properties.getConfig().loadPropertiesFromSrc();
        String token = properties.getConfig().getToken();

        String[] arr = new String[]{token,timestamp,nonce};
        //排序
        Arrays.sort(arr);

        //生成字符串
        StringBuffer content = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }

        //sha1加密
        String temp = getSha1(content.toString());
        return temp.equals(signature);

    }

    /**
     * 定义sha1的加密规则
     * @param str   需要加密的字符串
     * @return
     */
    public static String getSha1(String str){
        if (null == str || 0 == str.length()){
            return null;
        }
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char[] buf = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
