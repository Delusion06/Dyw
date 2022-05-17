package com.yc.bean;

import java.sql.Timestamp;

public class Message {

    private Integer id;
    private Integer fid;
    private String uname;
    private String content;
    private Timestamp createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    




    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", fid=" + fid +
                ", uname='" + uname + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
