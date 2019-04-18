package cn.spring.day23tx.service;

import cn.spring.day23tx.dao.IAccountDAO;
import cn.spring.day23tx.dao.IStockDAO;
import cn.spring.day23tx.entity.MyException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname StockServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 11:36
 * @Created by Happy-微冷的雨
 */
public class StockServiceImpl implements IStockService {
    //注意：这里需要做什么？？？？
    //~注入呵呵~~~
    @Autowired
    private IAccountDAO accountDAO;
    @Autowired
    private IStockDAO stockDAO;
    @Override
    public int buyStock(int sid, int count, int aid, int money) throws MyException {
        boolean isBuy=true;
        //账户金额减少
        int r1 = accountDAO.update(aid, money, isBuy);
         if (1==1) {
             //抛出一个异常
             throw new MyException("出错了");
         }
        //股数增多
        int r2 = stockDAO.updateStock(sid, count, isBuy);
        if (r1>0&&r2>0) {
           return r1+r2;
        }else {
            return -1;
        }
    }

    public IAccountDAO getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public IStockDAO getStockDAO() {
        return stockDAO;
    }

    public void setStockDAO(IStockDAO stockDAO) {
        this.stockDAO = stockDAO;
    }
}


















