package cn.spring.day24ssm.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/22 10:13
 * @Created by Happy-微冷的雨
 */
@WebServlet(name = "StudentServlet",urlPatterns = {"/StudentServlet"},initParams = {@WebInitParam(name = "keykey",value = "vv")})
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //如何获取initparam中植入的值
        /*String value = getInitParameter("keykey");
        System.out.println(value);
        */
        String value =getServletContext().getInitParameter("globalKey");
        System.out.println(value);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
