package cn.spring.day07annotationdi;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname Book
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/12 10:10
 * @Created by Happy-微冷的雨
 */
//让Book变成Spring容器中的一个bean
/*@Component*/
@Repository
/*@Service
@Controller*/
public class Book {
    @Value("100")
    private Integer bookid;
    @Value("艰难的抉择---卡莉·菲奥莉娜---HP----》女的")
    private String bookname;
    @Value("60")
    private Integer bookprice;

    //域属性
    //Spring 注解

/*    @Autowired
    //byType  byName
    @Qualifier("xxxx")*/
//JDK注解
    @Resource(name = "xxxx")
    private Publisher pub;

    public Publisher getPub() {
        return pub;
    }

    public void setPub(Publisher pub) {
        this.pub = pub;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getBookprice() {
        return bookprice;
    }

    public void setBookprice(Integer bookprice) {
        this.bookprice = bookprice;
    }
}
