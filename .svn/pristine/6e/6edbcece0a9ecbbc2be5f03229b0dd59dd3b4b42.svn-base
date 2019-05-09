package com.school.wechat.wechatserver.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;


/**
 * 用来获取wechar_sdk.properties中的属性
 * date: 2018-8-3 20:05:00
 * author：hjy
 */
public class properties {

    private static Logger log = LoggerFactory.getLogger(properties.class);

    public static final String WECHAR_INFO = "wechar_sdk.properties";


    /** 配置文件中的模板的编号. */
    public static final String Template = "wechar.template";
    /** 配置文件中的Token. */
    public static final String Token = "wechar.token";
    /** 配置文件中的appid. */
    public static final String AppID = "wechar.appID";
    /** 配置文件中的appsecret */
    public static final String AppSecret = "wechar.appSecret";
    /** 配置文件中的url */
    public static final String Url = "wechar.url";
    /** 微信支付：授权回调地址 */
    public static final String redirectUri = "wechar.redirectUri";
    /** 公众号前端url */
    public static final String weixinUrl = "wechar.weixinUrl";



    /** 操作对象. */
    private static properties config = new properties();
    /** 属性文件对象. */
    private Properties properties;



    /**模板的编号. */
    private String template;
    /**Token. */
    private String token;
    /**appid. */
    private String appid;
    /** appsecret */
    private String appsecret;
    /** 点击模板跳转的地址 */
    private String url;
    /** 授权回调地址 */
    private String redirect_uri;
    /** 天使打赏前端url */
    private String weixin_url;

    /**
     * 获取config对象.
     * @return
     */
    public static properties getConfig() {
        return config;
    }


    /**
     * 从classpath路径下加载配置参数
     */
    public void loadPropertiesFromSrc() {
        InputStream in = null;
        try {
            log.info("从classpath: " + properties.class.getClassLoader().getResource("").getPath() + " 获取属性文件" + WECHAR_INFO);
            in = properties.class.getClassLoader().getResourceAsStream(WECHAR_INFO);
            if (null != in) {
                properties = new Properties();
                try {
                    properties.load(in);
                } catch (IOException e) {
                    throw e;
                }
            } else {
                log.error(WECHAR_INFO + "属性文件未能在classpath指定的目录下 " + properties.class.getClassLoader().getResource("").getPath() + " 找到!");
                return;
            }
            loadProperties(properties);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
    }

    /**
     * 根据传入的  对象设置配置参数
     *
     * @param pro
     */
    public void loadProperties(Properties pro) {
        log.info("开始从属性文件中加载配置项");
        String value = null;

        value = pro.getProperty(Template);
        if (!StringUtils.isEmpty(value)) {
            this.template = value.trim();
            log.info("配置项：模板的编号==>" + Template + "==>" + value + " 已加载");
        }
        value = pro.getProperty(Token);
        if (!StringUtils.isEmpty(value)) {
            this.token = value.trim();
            log.info("配置项：Token==>" + Token + "==>" + value + " 已加载");
        }
        value = pro.getProperty(AppID);
        if (!StringUtils.isEmpty(value)) {
            this.appid = value.trim();
            log.info("配置项：开发者编号==>" + AppID + "==>" + value + " 已加载");
        }
        value = pro.getProperty(AppSecret);
        if (!StringUtils.isEmpty(value)) {
            this.appsecret = value.trim();
            log.info("配置项：开发者密码==>" + AppSecret + "==>" + value + " 已加载");
        }
        value = pro.getProperty(Url);
        if (!StringUtils.isEmpty(value)) {
            this.url = value.trim();
            log.info("配置项：模板的请求地址==>" + Url + "==>" + value + " 已加载");
        }
        value = pro.getProperty(redirectUri);
        if (!StringUtils.isEmpty(value)) {
            this.redirect_uri = value.trim();
            log.info("配置项：授权回调地址==>" + redirectUri + "==>" + value + " 已加载");
        }
        value = pro.getProperty(weixinUrl);
        if (!StringUtils.isEmpty(value)) {
            this.weixin_url = value.trim();
            log.info("配置项：前端URL==>" + weixinUrl + "==>" + value + " 已加载");
        }
    }


    /**
     * 从properties文件加载
     *
     * @param rootPath
     *            不包含文件名的目录.
     */
    public void loadPropertiesFromPath(String rootPath) {
        if (StringUtils.isNotBlank(rootPath)) {
            log.info("从路径读取配置文件: " + rootPath + File.separator + WECHAR_INFO);
            File file = new File(rootPath + File.separator + WECHAR_INFO);
            InputStream in = null;
            if (file.exists()) {
                try {
                    in = new FileInputStream(file);
                    properties = new Properties();
                    properties.load(in);
                    loadProperties(properties);
                } catch (FileNotFoundException e) {
                    log.error(e.getMessage(), e);
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                } finally {
                    if (null != in) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            log.error(e.getMessage(), e);
                        }
                    }
                }
            } else {
                // 由于此时可能还没有完成LOG的加载，因此采用标准输出来打印日志信息
                log.error(rootPath + WECHAR_INFO + "不存在,加载参数失败");
            }
        } else {
            loadPropertiesFromSrc();
        }

    }






    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public String getRedirectUri() {
        return redirect_uri;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getWeixinUrl() { return weixin_url;}

    public void setWeixinUrl(String weixin_url) {this.weixin_url = weixin_url;}

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
