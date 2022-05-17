package com.yc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * 服务器端URL地址里面的第一个/表示的是工程名后面的/
 * 浏览器端URL地址里面的第一个/表示的是域名后面的/
 */

@WebServlet("/VerifyCodeServlet")
public class VerifyCodeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //在输出图片之前先获取会话对象
        HttpSession session = request.getSession();
        //获取验证码+将图片输出到浏览器
        String vcode = VerifyCodeUtils.outputImage(response);
        //将验证码保存到Session对象中
        session.setAttribute("vcode",vcode);
        //生成验证码的时刻，保存时间
        request.getSession().setAttribute("codeTime", new Date().getTime());

    }
}
