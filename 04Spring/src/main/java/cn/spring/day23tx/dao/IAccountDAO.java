package cn.spring.day23tx.dao;

/**
 * @Classname IAccountDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 11:23
 * @Created by Happy-微冷的雨
 */
//账号接口
public interface IAccountDAO {
  //更改账户金额

    /**
     *
     * @param aid  账户卡号
     * @param money  改变金额
     * @param isBuy  是转入还是转出
     * @return
     */
    public int update(int aid,int money,boolean isBuy);
}
