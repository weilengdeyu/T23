package cn.springmvc.day12ssm.cn.book.service;


import cn.springmvc.day12ssm.cn.book.entity.Book;

/**
 * Created by Happy on 2018-12-18.
 */
public interface IBookService {
    //01.写一个添加图书的方法
    public int addBook(Book book);
}
