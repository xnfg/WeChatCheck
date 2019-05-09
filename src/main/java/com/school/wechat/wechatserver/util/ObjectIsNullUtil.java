package com.school.wechat.wechatserver.util;

import org.springframework.util.ObjectUtils;

import java.lang.reflect.Field;

/**
 * 判断对象属性是否有空值
 */
public class ObjectIsNullUtil {

 public static  boolean isAllFieldNull(Object obj) throws Exception{
     Class stuCla = (Class) obj.getClass();//得到类对象
     Field[] fs = stuCla.getDeclaredFields();//得到属性集合
     boolean flag = true;
     for (Field f : fs) {
         f.setAccessible(true); // 设置属性是可以访问的(私有的也可以)
         Object val = f.get(obj);// 得到此属性的值
         if(ObjectUtils.isEmpty(val)) {//只要有1个属性为空,那么返回false
             flag = false;
             break;
         }
     }
     return flag;
 }

}
