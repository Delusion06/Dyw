package com.yc.servlet;

import com.google.gson.Gson;
import com.yc.bean.MessAndRep;
import com.yc.bean.Message;
import com.yc.biz.MessageBiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/Msg.s")
public class MsgServlet extends HttpServlet {

    private MessageBiz dywBiz = new MessageBiz();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String op=request.getParameter("op");
        if("add".equals(op)){
            doAdd(request,response);
        }else if("findAll".equals(op)){
            doFindAll(request,response);
        }else if("delete".equals(op)){
            doDele(request,response);
        }

    }

    private void doDele(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        //System.out.println(id+"aaaaaaaaaaaaaaaaaaaaaaa");
        Message msg=new Message();
        msg.setId(id);
        try {
            int res=dywBiz.delMsg(msg);
            Gson gson=new Gson();
            String info=gson.toJson(res);
            //System.out.println(info+"bbbbbbbb");
            response.getWriter().print(info);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void doFindAll(HttpServletRequest request, HttpServletResponse response) {
        try {
            // List<Message> list = dywBiz.findMsg();
            MessAndRep messAndRep=new MessAndRep();
            String fid=request.getParameter("fid");
            int fid02=Integer.parseInt(fid);
            messAndRep.setFid(fid02);
            List<MessAndRep> list = dywBiz.findMessAndRep(messAndRep);
            //System.out.println(list+",,,,,,,,,,");
            Gson gson=new Gson();
            Map<String,Object> map=new HashMap<String,Object>();
            if(list!=null){
                map.put("code",'1');
                map.put("data",list);
            }else{
                map.put("code",0);
                map.put("data","查询不到数据......");
            }
            String info=gson.toJson(map);
            response.getWriter().print(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void doAdd(HttpServletRequest request, HttpServletResponse response) {
        //加载实体对象
        Message message = new Message();
        String fid01 = request.getParameter("fid");
        String createName = request.getParameter("createName");
        String email=request.getParameter("email");
        String uname=createName+"&&"+email;
        message.setUname(uname);
        int fid02=Integer.parseInt(fid01);
        message.setFid(fid02);
        message.setContent(request.getParameter("content"));

        try {
            int res= dywBiz.addMsg(message);
            Gson gson=new Gson();
            String info=gson.toJson(res);
           // System.out.println(info+"aaaaaaaaaaaaaaaaaa");
            response.getWriter().append("留言成功");

        } catch (Exception e) {
            e.printStackTrace();
            try {
                response.getWriter().append("留言失败:" + e.getMessage());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }

//    private void doAddMsg(HttpServletRequest request, HttpServletResponse response) {
//
//        //加载实体对象
//        Message message = new Message();
//        String fid01 = request.getParameter("fid");
//        String createName = request.getParameter("createName");
//        String email = request.getParameter("email");
//        String uname = createName + "&&" + email;
//        message.setUname(uname);
//        int fid02 = Integer.parseInt(fid01);
//        message.setFid(fid02);
//        message.setContent(request.getParameter("content"));
//        try {
//            dywBiz.addMsg(message);
//            response.getWriter().append("留言成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//
//            try {
//                response.getWriter().append("留言失败:" + e.getMessage());
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//
//        }
//
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
