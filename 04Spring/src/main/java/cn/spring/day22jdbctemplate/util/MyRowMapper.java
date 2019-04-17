package cn.spring.day22jdbctemplate.util;

import cn.spring.day22jdbctemplate.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * @Classname MyRowMapper
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/17 10:57
 * @Created by Happy-微冷的雨
 */
public class MyRowMapper<T> implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int index) throws SQLException {
        Book book=new Book();
        int bookid = rs.getInt("bookid");
        String bookname = rs.getString("bookname");
        int bookprice = rs.getInt("bookprice");
        book.setBookid(bookid);
        book.setBookname(bookname);
        book.setBookprice(bookprice);
        return book;
    }
}
