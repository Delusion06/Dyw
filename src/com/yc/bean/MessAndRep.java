package com.yc.bean;

import java.sql.Timestamp;

public class MessAndRep {

    //message
    private Integer id;
    private Integer fid;
    private String uname;
    private String content;
    private Timestamp createTime;


    //reply
    private Integer rid;
    private Timestamp replyTime;
    private String replyContent;

    public Integer getId() {
        return id;
    }

    public Integer getFid() {
        return fid;
    }

    public String getUname() {
        return uname;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public Integer getRid() {
        return rid;
    }

    public Timestamp getReplyTime() {
        return replyTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public void setReplyTime(Timestamp replyTime) {
        this.replyTime = replyTime;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Override
    public String toString() {
        return "MessAndRep{" +
                "id=" + id +
                ", fid=" + fid +
                ", uname='" + uname + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", rid=" + rid +
                ", replyTime=" + replyTime +
                ", replyContent='" + replyContent + '\'' +
                '}';
    }
}
