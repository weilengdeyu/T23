package cn.springmvc.day12ssm.cn.book.dao;


import cn.springmvc.day12ssm.cn.book.entity.Book;

import java.util.List;

public interface BookMapper {
    //Mybatis  Generator   fastmybatis

    int deleteByPrimaryKey(Integer bookid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    //查询所有图书记录
    //无参
    List<Book> findAllBooks();

}