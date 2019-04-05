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
public class Day03 {
    //添加学生
    @Test
    public  void testAdd() throws IOException {
        //三个
        SqlSession session = MybatisUtil.getSession();

        IStudentDAO studentDAO = session.getMapper(IStudentDAO.class);
        Student stu=new Student();
        stu.setSname("猫猫");
        stu.setGid(1);
        stu.setSid(6);
        int count= studentDAO.updateStudent(stu);
        //千万别忘了提交事务，真正的能影响数据记录的最后一道关卡，事务的提交与回滚
        session.commit();
        if (count>0){
            System.out.println("update ok");
        }else{
            System.out.println("add failed");
        }


    }

    //删除学生
    @Test
    public  void testDel() throws IOException {
        //三个
        SqlSession session = MybatisUtil.getSession();

        IStudentDAO studentDAO = session.getMapper(IStudentDAO.class);

        int count= studentDAO.deleteStudent(6);
            //千万别忘了提交事务，真正的能影响数据记录的最后一道关卡，事务的提交与回滚
            session.commit();
            if (count>0){
                System.out.println("delete ok");
            }else{
            System.out.println("add failed");
        }


    }


}
