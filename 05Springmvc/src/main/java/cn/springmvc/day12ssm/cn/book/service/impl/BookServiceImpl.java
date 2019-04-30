package cn.springmvc.day12ssm.cn.book.service.impl;/**
 * Created by Happy on 2018-12-18.
 */

import cn.springmvc.day12ssm.cn.book.dao.BookMapper;
import cn.springmvc.day12ssm.cn.book.entity.Book;
import cn.springmvc.day12ssm.cn.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：微冷的雨
 *
 * @create 2018-12-18
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("bookService")
public class BookServiceImpl implements IBookService {

    //引入dao
    @Autowired
    private BookMapper bookMapper;
    @Override
    public int addBook(Book book) {
        return bookMapper.insertSelective(book);
    }
}
