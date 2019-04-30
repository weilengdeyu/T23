package cn.springmvc.day12ssm.cn.book.controller;/**
 * Created by Happy on 2018-12-18.
 */

import cn.springmvc.day12ssm.cn.book.entity.Book;
import cn.springmvc.day12ssm.cn.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：微冷的雨
 *
 * @create 2018-12-18
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @RequestMapping("/addBook")
    public String add(Book book){
        int count = bookService.addBook(book);
        if (count>0){
            return "/day12ssm/success.jsp";
        }else{
            return "/addbook.jsp";
        }
    }
}
