package cn.happy.day01;

import cn.happy.dao.IResultDAO;
import cn.happy.dao.IStudentDAO;
import cn.happy.dao.impl.StudentDAOImpl;
import cn.happy.entity.Result;
import cn.happy.entity.Student;
import cn.happy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @Classname Day01
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/2 12:17
 * @Created by Happy-微冷的雨
 */
public class Day02 {
    @Test
    public  void t1() throws IOException {
       /* IStudentDAO dao=new StudentDAOImpl();
        Student stu = dao.findById(1);
        System.out.println(stu);*/
    }


    @Test
    public  void t2() throws IOException {
        //三个
        SqlSession session = MybatisUtil.getSession();
        IResultDAO resultDAO = session.getMapper(IResultDAO.class);
        List<Result> list = resultDAO.findAllResults();
        for (Result item:list){
            System.out.println(item.getScore());
        }
        //IResultDAO dao=;

    }
    @Test
    //解释反射的例子
    public  void t3Reflection() throws IOException {
        //大家的认知里,result是一个对象，Result是一个类型
        //如果今天我告诉大家，Result是一个对象，他的类型是谁？？？Class类型
        //任何数据类型，如果站在他是对象的维度来看来，他们的类型都是Class，我们 
        //就称我们之前认知中的每种数据类型都是Class对象
        Class clazz = Result.class;
        Result rr=new Result();
        Class clazz2 = rr.getClass();
        System.out.println(clazz);
    }

}
