package com.yc.dao;

import com.yc.bean.MessAndRep;
import com.yc.bean.Message;
import com.yc.utils.DBHelper;

import java.util.ArrayList;
import java.util.List;

public class MessageDao {

    private DBHelper dbh = new DBHelper();

    /**
     * 添加留言
     * @param msg
     * @return
     * @throws Exception
     */
    public Integer insertMsg(Message msg) throws Exception {
        String sql = "insert into tb_msg values(null,?,?,?,now())";
        return dbh.update(sql,msg.getFid(),msg.getUname(),msg.getContent());
    }


    /**
     * 查询所有
     * @param
     * @return
     * @throws Exception
     */
    public List<Message> findMsg() throws Exception {
        String sql = "select *from tb_msg";
        return dbh.findMutipl(sql,null,Message.class);
    }



    /**
     * 联合查询
     * @param
     * @return
     * @throws Exception
     */
    public List<MessAndRep> findMessAndRep(MessAndRep messAndRep) throws Exception {
        String sql = "select *from tb_msg left join tb_reply on tb_msg.id=tb_reply.id where tb_msg.fid=?";
        List<Object> params=new ArrayList<>();
        params.add(messAndRep.getFid());
        return dbh.findMutipl(sql,params,MessAndRep.class);
    }


    /**
     * 删除留言
     * @param msg
     * @return
     * @throws Exception
     */
    public Integer delMsg(Message msg) throws Exception {
        String sql02 = "delete from tb_msg where id=? ";
        List<Object> param=new ArrayList<>();
        param.add(msg.getId());

        String sql01="delete from tb_reply where id=?";
         dbh.update(sql01,param);
        int i=dbh.update(sql02,param);
        return i;
    }



}