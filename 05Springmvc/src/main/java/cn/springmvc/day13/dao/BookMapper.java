package cn.springmvc.day13.dao;

import cn.springmvc.day13.model.Book;

public interface BookMapper {
    //根据主键删除
    int deleteByPrimaryKey(Integer bookid);
  //02.添加，插入
    int insert(Book record);
   //
    int insertSelective(Book record);
   //03.根据主键查询
    Book selectByPrimaryKey(Integer bookid);
   //根据主键修改
    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}