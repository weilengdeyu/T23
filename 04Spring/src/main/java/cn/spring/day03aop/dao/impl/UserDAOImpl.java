package cn.spring.day03aop.dao.impl;

import cn.spring.day03aop.dao.IUserDAO;
import cn.spring.day03aop.entity.User;

/**
 * @Classname UserDAOImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/11 9:55
 * @Created by Happy-微冷的雨
 */
public class UserDAOImpl implements IUserDAO {
    @Override
    public void saveUser(User user) {
        System.out.println("save user ok!");
    }
}
