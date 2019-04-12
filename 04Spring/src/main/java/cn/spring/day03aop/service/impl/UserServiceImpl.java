package cn.spring.day03aop.service.impl;

import cn.spring.day03aop.dao.IUserDAO;
import cn.spring.day03aop.entity.User;
import cn.spring.day03aop.service.IUserService;

/**
 * @Classname UserServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/11 9:56
 * @Created by Happy-微冷的雨
 */
public class UserServiceImpl implements IUserService {
    //准备接口类型，接口类型的实现类，由配置文件确定
    private IUserDAO userDAO;
    @Override
    //override：
    public int saveUser(User user) {
        userDAO.saveUser(user);
        updateUser(user);
        return 1;
    }

    @Override
    public int updateUser(User user) {
        userDAO.updateUser(user);
        return 1;
    }

    @Override
    public int delUser(Integer id) {
        userDAO.delUser(id);
        return 1;
    }

    @Override
    public void selectAllUsers() {
        userDAO.selectAllUsers();
    }

    public IUserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
