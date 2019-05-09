package com.school.wechat.wechatserver.api.base.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MyJob {
    private String Msg;
    private String msgId;
    private Date time;
    private boolean isTouchMove;

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isTouchMove() {
        return isTouchMove;
    }

    public void setTouchMove() {
        isTouchMove = false;
    }
}
