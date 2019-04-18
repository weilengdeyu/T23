package cn.spring.day22;

import cn.spring.day21aspectjxml.SomeService;
import cn.spring.day22jdbctemplate.entity.Book;
import cn.spring.day22jdbctemplate.entity.Stock;
import cn.spring.day22jdbctemplate.service.IBookService;
import cn.spring.day22jdbctemplate.service.IStockService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Classname SpringTest0120190410
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 11:16
 * @Created by Happy-微冷的雨
 */
public class SpringTest0320190417 {

    @Test
    public void testStock(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day22.xml");
        //2.从容器中获取指定的bean
        IStockService stockService = ctx.getBean("stockService", IStockService.class);
        List<Stock> list = stockService.findAllStocks();
        for (Stock item:list){
            System.out.println(item.getSname());
        }
    }



    @Test
    public void testAutoWire(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day22.xml");
        //2.从容器中获取指定的bean
        IBookService bookService = ctx.getBean("bookService", IBookService.class);
        List<Book> list = bookService.findAllBooks();
        for (Book item:list){
            System.out.println(item.getBookname()+"\t"+item.getBookid());
        }
    }
}
