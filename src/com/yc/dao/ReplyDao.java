package com.yc.dao;

import com.yc.bean.Reply;
import com.yc.utils.DBHelper;

public class ReplyDao {
    DBHelper db=new DBHelper();


    //添加回复
    public int addReply(Reply reply) throws Exception{
        String sql="insert into tb_reply values(null,?,now(),?)";
        return db.update(sql,reply.getId(),reply.getReplyContent());
    }




}
