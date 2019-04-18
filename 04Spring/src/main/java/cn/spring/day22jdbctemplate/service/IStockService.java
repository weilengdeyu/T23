package cn.spring.day22jdbctemplate.service;

import cn.spring.day22jdbctemplate.entity.Stock;

import java.util.List;

/**
 * @Classname IStockService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 9:50
 * @Created by Happy-微冷的雨
 */
public interface IStockService {
    public List<Stock> findAllStocks();
}
