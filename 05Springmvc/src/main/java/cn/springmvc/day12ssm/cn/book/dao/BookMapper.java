package cn.springmvc.day12ssm.cn.book.dao;


import cn.springmvc.day12ssm.cn.book.entity.Book;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}