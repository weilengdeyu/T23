package cn.spring.day22jdbctemplate.dao;

import cn.spring.day22jdbctemplate.entity.Book;
import cn.spring.day22jdbctemplate.util.RowMapperUtil;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @Classname BookDAOImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/17 9:15
 * @Created by Happy-微冷的雨
 */
//继承的是JDBCDaoSupport类 站在更好维度，给程序员提供选择
public class BookDAOImpl extends JdbcDaoSupport implements IBookDAO {
    @Override
    public List<Book> findAllBooks() {
        String sql="select * from book";
        //补全mapRow方法使用的是 alt+enter
        List<Book> list = this.getJdbcTemplate().query(sql, new RowMapperUtil<Book>(){});
        return list;
    }
}
