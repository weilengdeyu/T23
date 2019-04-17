package cn.spring.day22jdbctemplate.dao;


import cn.spring.day22jdbctemplate.entity.Book;

import java.util.List;

/**
 * @Classname IBookDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/17 9:15
 * @Created by Happy-微冷的雨
 */
public interface IBookDAO {
     public List<Book> findAllBooks();
}
