package cn.happy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/1 11:26
 * @Created by Happy-微冷的雨
 */
@WebServlet(name = "FirstServlet",urlPatterns = {"/FirstServlet"})
public class FirstServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("=======init===============");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // 除了Get和Post  ，还有哪些请求方式
        System.out.println("======servlet======");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
