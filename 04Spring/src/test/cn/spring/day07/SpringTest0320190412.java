package cn.spring.day07;

import cn.spring.day06collection.BeanCollection;
import cn.spring.day07annotationdi.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

/**
 * @Classname SpringTest0120190410
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 11:16
 * @Created by Happy-微冷的雨
 */
public class SpringTest0320190412 {
    //01.自动装配
    @Test
    public void testAutoWire(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day07.xml");
        //2.从容器中获取指定的bean
        Book book= ctx.getBean("book", Book.class);
        System.out.println(book.getBookid());
        System.out.println(book.getBookname());
        System.out.println(book.getBookprice());
        System.out.println(book.getPub().getPubname());

    }
}
