package cn.spring.day23tx.service;

import cn.spring.day23tx.entity.MyException;

/**
 * @Classname IStockService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 11:33
 * @Created by Happy-微冷的雨
 */
//一个service层的接口就可以了
public interface IStockService {
    //定义一个购买股票的方法
    //需要知道哪些信息？
    //购买哪只股票         sid
    //购买多少股           scount
    //用哪张银行卡支付      aid
    //购买股票一共支付多少钱 money
    public int buyStock(int sid,int count,int aid,int money) throws MyException;
}
