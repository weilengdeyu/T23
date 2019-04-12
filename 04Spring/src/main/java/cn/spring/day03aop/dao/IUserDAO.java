package cn.spring.day03aop.dao;

import cn.spring.day03aop.entity.User;

/**
 * @Classname IUserDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/11 9:54
 * @Created by Happy-微冷的雨
 */
public interface IUserDAO {
    public int saveUser(User user);
    public int updateUser(User user);
    public int delUser(Integer id);
    public void selectAllUsers();
}
