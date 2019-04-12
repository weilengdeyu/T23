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
    public int saveUser(User user) {
        System.out.println("save user ok!");
        return 1;
    }

    @Override
    public int updateUser(User user) {
        System.out.println("update ok");
        return 1;
    }

    @Override
    public int delUser(Integer id) {
        System.out.println("del ok!");
        return 1;
    }

    @Override
    public void selectAllUsers() {
        System.out.println("假装返回所有记录");
    }
}
