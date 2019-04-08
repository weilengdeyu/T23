package cn.happy.dao;

import cn.happy.entity.Category;

import java.util.List;

/**
 * @Classname ICategoryDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/8 11:21
 * @Created by Happy-微冷的雨
 */
public interface ICategoryDAO {
    //01.根据pid检索该pid下所有的子分类，包括子分类的子分类
    public List<Category> getCategoriesByPid(int pid) throws Exception;
}
