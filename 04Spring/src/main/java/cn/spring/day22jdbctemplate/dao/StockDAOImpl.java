package cn.spring.day22jdbctemplate.dao;

import cn.spring.day22jdbctemplate.entity.Book;
import cn.spring.day22jdbctemplate.entity.Stock;
import cn.spring.day22jdbctemplate.util.RowMapperUtil;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @Classname StockDAOImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 9:48
 * @Created by Happy-微冷的雨
 */
public class StockDAOImpl extends JdbcDaoSupport implements IStock {
    @Override
    public List<Stock> findAllStocks() {
        String sql="select * from stock";
        List<Stock> list = this.getJdbcTemplate().query(sql, new RowMapperUtil<Stock>(){});
        return list;
    }
}
