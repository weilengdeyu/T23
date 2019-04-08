package cn.happy.day01;

import cn.happy.dao.ICategoryDAO;
import cn.happy.dao.IDeptDAO;
import cn.happy.dao.IEmpDAO;
import cn.happy.dao.IStudentDAO;
import cn.happy.entity.Category;
import cn.happy.entity.Dept;
import cn.happy.entity.Emp;
import cn.happy.entity.Student;
import cn.happy.entity.viewmodel.StudentCondition;
import cn.happy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname Day01
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/2 12:17
 * @Created by Happy-微冷的雨
 */
public class Day06 {


    @Test
    //测试自关联
    public  void testSelfSQL() throws Exception {

        SqlSession session = MybatisUtil.getSession();
        ICategoryDAO dao = session.getMapper(ICategoryDAO.class);
        List<Category> list = dao.getCategoriesByPid(0);
        for (Category cate:list){
            System.out.println(cate);
        }
    }

    @Test
    //测试多对一   多条SQL
    public  void testManyToOneMultipleSQL() throws Exception {

        SqlSession session = MybatisUtil.getSession();
        IEmpDAO dao = session.getMapper(IEmpDAO.class);
        Emp emp = dao.getEmpInfoByNoMutilSQL(1);
        System.out.println(emp.getEmpname());
        System.out.println("======================");
        System.out.println(emp.getDept().getDeptname());
    }

    @Test
    //测试多对一   单条SQL
    public  void testManyToOneSIngleSQL() throws Exception {
        SqlSession session = MybatisUtil.getSession();
        IEmpDAO dao = session.getMapper(IEmpDAO.class);
        Emp emp = dao.getEmpInfoByNo(1);
        System.out.println(emp.getEmpname());
        System.out.println("======================");
        System.out.println(emp.getDept().getDeptname());
    }

    @Test
    //测试一对多     多条SQL
    public  void testOneToManyMultiPleSQL() throws Exception {

        SqlSession session = MybatisUtil.getSession();
        IDeptDAO dao = session.getMapper(IDeptDAO.class);
        Dept dept = dao.getDeptByIdMultiSQL(1);
        System.out.println(dept.getDeptname());
        System.out.println("================");
        for(Emp emp:dept.getEmps()){
            System.out.println(emp.getEmpname());
        }
    }


    @Test
    //测试一对多     单条SQL
    public  void testOneToManySingleSQL() throws Exception {

        SqlSession session = MybatisUtil.getSession();
        IDeptDAO dao = session.getMapper(IDeptDAO.class);
        Dept dept = dao.getDeptById(1);
        System.out.println(dept.getDeptname());
        System.out.println("==============");
        for(Emp emp:dept.getEmps()){
            System.out.println(emp.getEmpname());
        }
    }



}
