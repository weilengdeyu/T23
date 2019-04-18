package cn.spring.day23tx.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Classname AccountDAOImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 11:24
 * @Created by Happy-微冷的雨
 */
public class AccountDAOImpl extends JdbcDaoSupport implements IAccountDAO {
    @Override
    public int update(int aid, int money, boolean isBuy) {
        String sql="";
        int count;
        if (isBuy){ //金额减少
            sql="update account set abalance=abalance-? where aid=?";
            count=this.getJdbcTemplate().update(sql,money,aid);
        }else{
            //金额增多，抛出股票
            sql="update account set abalance=abalance+? where aid=?";
            count=this.getJdbcTemplate().update(sql,money,aid);
        }
        return count;
    }
}
