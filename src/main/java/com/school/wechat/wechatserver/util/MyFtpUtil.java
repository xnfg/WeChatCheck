package com.school.wechat.wechatserver.util;

import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ftp 上传和下载文件的工具类
 * data: 2018-7-23
 */
public class MyFtpUtil {

    /**
     * FTP上传单个文件
     * 1.连接服务
     * 2.确定你要上传的文件
     * 3.指定你在服务器端存放的位置
     * @param username  ftp服务的用户名
     * @param password  ftp服务的密码
     * @param host      ftp服务的主机地址
     * @param dir       文件上传的位置
     * @param fis       文件的输入流
     * @param suffix    文件的后缀名
     */
    public static void ftpUpload(String username,String password,String host,String dir,FileInputStream fis,String suffix) {
        FTPClient ftpClient = new FTPClient();

        try {
            ftpClient.connect(host);
            ftpClient.login(username, password);

            //设置上传目录
            ftpClient.changeWorkingDirectory(dir);
            ftpClient.setBufferSize(1024);
            ftpClient.setControlEncoding("GBK");
            //设置文件类型（二进制）
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.storeFile(DateUtil.getAllTimes()+"."+suffix, fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("FTP客户端出错！", e);
        } finally {
            IOUtils.closeQuietly(fis);
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("关闭FTP连接发生异常！", e);
            }
        }
    }

    /**
     * FTP下载单个文件
     * @param username  ftp服务的用户名
     * @param password  ftp服务的密码
     * @param host      ftp服务的主机地址
     * @param dir       文件的在服务器的目录
     * @param filename  文件的名称
     */
    public static void ftpDownload(String username,String password,String host,String dir,String filename,String suffix) {
        FTPClient ftpClient = new FTPClient();
        FileOutputStream fos = null;
        try {
            ftpClient.connect(host);
            ftpClient.login(username, password);

            String remoteFileName = dir+"/"+filename;
            fos = new FileOutputStream("D:\\"+DateUtil.getAllTimes()+"."+suffix);

            ftpClient.setBufferSize(1024);
            //设置文件类型（二进制）
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.retrieveFile(remoteFileName, fos);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("FTP客户端出错！", e);
        } finally {
            IOUtils.closeQuietly(fos);
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("关闭FTP连接发生异常！", e);
            }
        }
    }




}
