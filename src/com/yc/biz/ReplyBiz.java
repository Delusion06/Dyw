package com.yc.biz;

import com.yc.bean.Reply;
import com.yc.dao.ReplyDao;

public class ReplyBiz {

    ReplyDao dao=new ReplyDao();

    //添加回复
    public int addReply(Reply reply) throws Exception{
        return dao.addReply(reply);
    }
}