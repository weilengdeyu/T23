package cn.spring.day23tx.dao;

/**
 * @Classname IStockDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 11:29
 * @Created by Happy-微冷的雨
 */
public interface IStockDAO {
    public int updateStock(int sid,int count,boolean isBuy);
}
