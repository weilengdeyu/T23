package cn.spring.day22jdbctemplate.service;

import cn.spring.day22jdbctemplate.entity.Book;

import java.util.List;

/**
 * @Classname IBookService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/17 9:34
 * @Created by Happy-微冷的雨
 */
public interface IBookService {
    public List<Book> findAllBooks();
}
