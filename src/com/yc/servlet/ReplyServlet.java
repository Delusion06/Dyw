package com.yc.servlet;

import com.google.gson.Gson;
import com.yc.bean.Reply;
import com.yc.biz.ReplyBiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//注解访问地址
@WebServlet("/reply.action")
public class ReplyServlet extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    ReplyBiz biz=new ReplyBiz();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //将请求对象和相应对象的编码集设置为utf-8，中文乱码
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //从前端传入一个op属性，根据他所传递的值是什么操作
        String op=request.getParameter("op");
        //字符串比较s1.equals(s2)		true	false
        if("reply".equals(op)) {
            //注册
            doReply(request,response);
        }
    }

    private void doReply(HttpServletRequest request, HttpServletResponse response) {
        String mid= request.getParameter("mid");
        String replyContent= request.getParameter("replyContent");
        Reply reply=new Reply();
        reply.setReplyContent(replyContent);
        reply.setId(Integer.parseInt(mid));
        try {
            int res=biz.addReply(reply);
            Gson gson=new Gson();
            String code=gson.toJson(res);
            response.getWriter().println(code);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);//所有的请求最终在doGet中处理
    }

}

