package cn.springmvc.day12ssm.cn.book.controller;/**
 * Created by Happy on 2018-12-18.
 */

import cn.springmvc.day12ssm.cn.book.entity.Book;
import cn.springmvc.day12ssm.cn.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

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

    //查询所有图书
    @RequestMapping("/findAll")
    public String findAll(Model model){
        //调度service的方法获取到图书集合
        List<Book> allBooks = bookService.findAllBooks();
        //Model是和前端View界面进行数据共享的一个容器
        model.addAttribute("list",allBooks);
        return "/day12ssm/list.jsp";
    }

    //查询所有图书  以json回送
    @RequestMapping("/findAllAjax")
    @ResponseBody
    public Object findAllAjax(){
        //1.1 获取到所有图书集合
        List<Book> allBooks = bookService.findAllBooks();

        //图书名称集合
        List<String> namelist=new ArrayList<String>();

        //图书价格集合
        List<Double> pricelist=new ArrayList<Double>();

        for (Book item:allBooks) {
            namelist.add(item.getBookname());
            pricelist.add(item.getBookprice());
        }
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("namelist",namelist); //
        map.put("pricelist",pricelist); //
        return map;
    }


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
