package com.yc.bean;


import java.sql.Timestamp;

/**
 * 回复
 */
public class Reply {

    private Integer rid;
    private Integer id;
    private Timestamp replyTime;
    private String replyContent;

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setReplyTime(Timestamp replyTime) {
        this.replyTime = replyTime;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Integer getRid() {
        return rid;
    }

    public Integer getId() {
        return id;
    }

    public Timestamp getReplyTime() {
        return replyTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "rid=" + rid +
                ", id=" + id +
                ", replyTime=" + replyTime +
                ", replyContent='" + replyContent + '\'' +
                '}';
    }
}
