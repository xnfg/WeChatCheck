package com.school.wechat.wechatserver;

import com.school.wechat.wechatserver.operation.Tonken;
import com.school.wechat.wechatserver.util.MyFtpUtil;
import com.school.wechat.wechatserver.util.RedisUtil;
import com.sun.javafx.tk.TKPulseListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.FileInputStream;

@SpringBootApplication
public class WechatserverApplication {

    private static Logger log = LoggerFactory.getLogger(WechatserverApplication.class);

    @Autowired
    RedisUtil redisUtil;

    public static void main(String[] args) {
        SpringApplication.run(WechatserverApplication.class, args);
    }


    @RequestMapping("")
    public String test1() {
        return "我是测试";
    }


    /**
     * 测试用户操作Redis、获取Access_token
     *
     * @return
     */
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        redisUtil.set("mytest", "bbbbb");
        return Tonken.getAccess_token(redisUtil);
    }

    @Value("${ftp.server.username}")
    private String username;

    @Value("${ftp.server.password}")
    private String password;

    @Value("${ftp.server.host}")
    private String host;

    @Value("${ftp.server.dir}")
    private String dir;

    FileInputStream fis = null;

    /**
     * 测试ftp文件上传
     */
    @RequestMapping(value = "/ftpcommint", method = RequestMethod.GET)
    public void ftpcommint() {
        try {
            File srcFile = new File("D:\\bj.jpg");
            fis = new FileInputStream(srcFile);
            //用户名、密码、主机地址、文件上传路径、文件的输入流,文件的后缀
            MyFtpUtil.ftpUpload(username, password, host, dir, fis, "jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试ftp文件下载
     * 暂时的只做了下载到某个文件夹
     */
    @RequestMapping(value = "/ftpgetfile", method = RequestMethod.GET)
    public void ftpgetfile() {
        try {
            //用户名、密码、主机地址、文件所在服务器路径、文件名称
            MyFtpUtil.ftpDownload(username, password, host, "/", "20181011142601607.jpg", "jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
