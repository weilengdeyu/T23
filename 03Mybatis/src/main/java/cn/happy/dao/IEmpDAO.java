package cn.happy.dao;

import cn.happy.entity.Emp;

/**
 * @Classname IEmpDAO
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/8 10:21
 * @Created by Happy-微冷的雨
 */
public interface IEmpDAO {
    //01.多对一  单条SQL  根据员工编号 检索 员工名称和    所属部门
    public Emp getEmpInfoByNo(int empno) throws Exception;
    //01.多对一  单条SQL  根据员工编号 检索 员工名称和    所属部门
    public Emp getEmpInfoByNoMutilSQL(int empno) throws Exception;

}
