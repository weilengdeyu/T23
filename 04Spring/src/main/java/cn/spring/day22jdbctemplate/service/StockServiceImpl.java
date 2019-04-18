package cn.spring.day22jdbctemplate.service;

import cn.spring.day22jdbctemplate.dao.IStock;
import cn.spring.day22jdbctemplate.entity.Stock;

import java.util.List;

/**
 * @Classname StockServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 9:50
 * @Created by Happy-微冷的雨
 */
public class StockServiceImpl implements IStockService {
    private IStock stockDAO;
    @Override
    public List<Stock> findAllStocks() {
        return stockDAO.findAllStocks();
    }

    public IStock getStockDAO() {
        return stockDAO;
    }

    public void setStockDAO(IStock stockDAO) {
        this.stockDAO = stockDAO;
    }
}
