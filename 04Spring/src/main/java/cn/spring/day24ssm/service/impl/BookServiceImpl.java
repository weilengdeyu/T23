package cn.spring.day24ssm.service.impl;

import cn.spring.day24ssm.dao.IBookDAO;
import cn.spring.day24ssm.entity.Book;
import cn.spring.day24ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname BookServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/19 10:50
 * @Created by Happy-微冷的雨
 */
public class BookServiceImpl implements IBookService {
    private IBookDAO bookDAO;
    @Override
    public void addBook(Book book) {
        bookDAO.addBook(book);
    }

    public IBookDAO getBookDAO() {
        return bookDAO;
    }

    public void setBookDAO(IBookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
}
