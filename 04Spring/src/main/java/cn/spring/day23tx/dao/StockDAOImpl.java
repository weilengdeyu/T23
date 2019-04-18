package cn.spring.day23tx.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Classname StockDAOImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 11:30
 * @Created by Happy-微冷的雨
 */
public class StockDAOImpl extends JdbcDaoSupport implements IStockDAO {
    @Override
    public int updateStock(int sid, int count,boolean isBuy) {
        String sql="";
        int result;
        if (isBuy){ //购买股票，股数增加的
            sql="update stock set scount=scount+? where sid=?";
            result=this.getJdbcTemplate().update(sql,count,sid);
        }else{
            //，抛出股票  股数减少的
            sql="update stock set scount=scount-? where sid=?";
            result=this.getJdbcTemplate().update(sql,count,sid);
        }
        return result;
    }
}
