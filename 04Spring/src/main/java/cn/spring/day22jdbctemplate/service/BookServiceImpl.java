package cn.spring.day22jdbctemplate.service;

import cn.spring.day22jdbctemplate.dao.IBookDAO;
import cn.spring.day22jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Classname BookServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/17 9:34
 * @Created by Happy-微冷的雨
 */
public class BookServiceImpl implements IBookService {
    //引入dao接口
    private IBookDAO bookDAO;
    @Override
    public List<Book> findAllBooks() {
        return bookDAO.findAllBooks();
    }

    public IBookDAO getBookDAO() {
        return bookDAO;
    }

    public void setBookDAO(IBookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
}
