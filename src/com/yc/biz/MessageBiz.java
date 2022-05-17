package com.yc.biz;


import com.yc.bean.MessAndRep;
import com.yc.bean.Message;
import com.yc.dao.MessageDao;

import java.sql.SQLException;
import java.util.List;

public class MessageBiz {
    private MessageDao md = new MessageDao();

    public int addMsg(Message msg) throws Exception {

        if (msg.getFid() == null){
            throw new BizException("电影编号未传入");
        }

        if (msg.getUname() == null || msg.getUname().trim().isEmpty()){
            throw new BizException("用户姓名未填写");
        }

        if (msg.getContent() == null || msg.getContent().trim().isEmpty()){
            throw new BizException("留言内容未填写");
        }

        try {
            return md.insertMsg(msg);
        } catch (SQLException e) {
            throw new BizException("业务繁忙，请稍后再试！",e);
        }
    }


    /**
     * 查询所有
     * @param
     * @return
     * @throws Exception
     */
    public List<Message> findMsg() throws Exception {
        return  md.findMsg();
    }


    /**
     * 联合查询
     * @param
     * @return
     * @throws Exception
     */
    public List<MessAndRep> findMessAndRep(MessAndRep messAndRep) throws Exception {
        return  md.findMessAndRep(messAndRep);
    }

    /**
     * 删除留言
     * @param msg
     * @return
     * @throws Exception
     */
    public Integer delMsg(Message msg) throws Exception {
        return  md.delMsg(msg);
    }


}
