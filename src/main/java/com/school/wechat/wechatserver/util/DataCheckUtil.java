package com.school.wechat.wechatserver.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataCheckUtil {
    public static boolean isPhone(String str) {
        Pattern p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$");
        Matcher m  = p.matcher(str);
        boolean b  = m.matches();
        return b;
    }
}
