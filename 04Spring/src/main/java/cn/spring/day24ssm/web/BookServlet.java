package cn.spring.day24ssm.web;

import cn.spring.day24ssm.entity.Book;
import cn.spring.day24ssm.service.IBookService;
import cn.spring.day24ssm.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/19 10:51
 * @Created by Happy-微冷的雨
 */
@javax.servlet.annotation.WebServlet(name = "BookServlet",urlPatterns = {"/bookServlet"})
public class BookServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("utf-8");
  /*      String value = getInitParameter("keykey");
        System.out.println(value);*/

        String value =getServletContext().getInitParameter("globalKey");
        System.out.println(value);

        System.out.println("xxxxxxxxxxxxxxxxx");
          //调度service
       /* ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day24.xml");*/
        ApplicationContext ctx= WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        System.out.println(ctx);
        IBookService bookService=ctx.getBean("bookService",IBookService.class);
        Book book=new Book();
        String bookname=req.getParameter("bookname");
        book.setBookname(bookname);
        int bookprice=Integer.parseInt(req.getParameter("bookprice"));
        book.setBookprice(bookprice);

        bookService.addBook(book);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
