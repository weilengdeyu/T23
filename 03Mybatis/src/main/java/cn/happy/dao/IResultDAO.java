package cn.happy.dao;

import cn.happy.entity.Result;

import java.util.List;

/**
 * @Classname IResultDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/3 10:53
 * @Created by Happy-微冷的雨
 */
public interface IResultDAO {
    //01.获取所有成绩
    public List<Result> findAllResults();
}
