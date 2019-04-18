package cn.spring.day22jdbctemplate.dao;

import cn.spring.day22jdbctemplate.entity.Stock;

import java.util.List;

/**
 * @Classname IStock
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 9:47
 * @Created by Happy-微冷的雨
 */
public interface IStock {
    public List<Stock> findAllStocks();
}
