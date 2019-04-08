package cn.happy.dao;

import cn.happy.entity.Dept;

/**
 * @Classname IDeptDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/8 9:09
 * @Created by Happy-微冷的雨
 */
public interface IDeptDAO {
    //01.一对多 单条SQL
    public Dept getDeptById(int deptno) throws Exception;
    //02.一对多 多条SQL
    public Dept getDeptByIdMultiSQL(int deptno) throws Exception;
}
