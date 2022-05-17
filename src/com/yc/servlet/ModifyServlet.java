package com.yc.servlet;

import com.google.gson.Gson;
import com.yc.dao.UserDao;
import com.yc.utils.EmailHelper;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/modify.s")
public class ModifyServlet extends BaseServlet {

    private void modify(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String email = request.getParameter("email");
        String upwd = request.getParameter("upwd");
        String uname = request.getParameter("uname");
        System.out.println(email+"===="+upwd+"===="+uname);
        int result = UserDao.updatePwdByEmail(uname, email, upwd);
        //返回json格式字符串给外界{"code":1}
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("code", result);

        Gson gson = new Gson();
        String info = gson.toJson(jsonMap);
        System.out.println("info:    " + info);
        response.getWriter().print(info);

    }

    private final EmailHelper emailHelper = new EmailHelper();

    private void yzm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String num = request.getParameter("num");
        String userName = request.getParameter("uname");


        String email = request.getParameter("email");
        System.out.println(email+ "=="+ num);
        try {
            emailHelper.email(email, num,userName);
        } catch (MessagingException | GeneralSecurityException e) {
            e.printStackTrace();
        }
    }

    private void checkEmail(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter("email");
        try {
            Map<String, Object> user = UserDao.findByEmail(email);
            int result = 0;
            if (user != null) {
                result = 1;
            }
            Map<String, Object> jsonMap = new HashMap<String, Object>();
            jsonMap.put("code", result);
            Gson gson = new Gson();
            String info = gson.toJson(jsonMap);
            response.getWriter().print(info);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
