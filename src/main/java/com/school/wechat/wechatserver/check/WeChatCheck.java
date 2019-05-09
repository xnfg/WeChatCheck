package com.school.wechat.wechatserver.check;

import com.school.wechat.wechatserver.util.CheckUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 微信服务器认证的处理器
 * data:2018-8-3 18:22:59
 * author：hjy
 */
@Controller
public class WeChatCheck {

    /**
     * 微信服务器的验证
     * @param signature     签名
     * @param timestamp     时间戳
     * @param nonce         随机数
     * @param echostr       随机字符串
     * @param response      响应对象
     * @throws IOException  抛出请求响应对象可能会出现的异常
     */
    @RequestMapping(value = "/wx",method = RequestMethod.GET)
    public void test(String signature, String timestamp, String nonce, String echostr, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        if(CheckUtil.checkSignature(signature, timestamp, nonce)){
            out.print(echostr);
        }
        //关闭输出对象
        out.close();
    }


}
