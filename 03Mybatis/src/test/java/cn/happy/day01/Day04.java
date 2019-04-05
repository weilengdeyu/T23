package cn.happy.day01;

import cn.happy.dao.IStudentDAO;
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
public class Day04 {
    //模糊查询
    @Test
    public  void testLike() throws IOException {
        //三个
        SqlSession session = MybatisUtil.getSession();
        IStudentDAO studentDAO = session.getMapper(IStudentDAO.class);
        List<Student> list = studentDAO.likeSelect("小","日本");
        for (Student stu:list){
            System.out.println(stu.getSname());
        }
    }

    //添加学生
    @Test
    public  void testAdd() throws IOException {
        //三个
        SqlSession session = MybatisUtil.getSession();

        IStudentDAO studentDAO = session.getMapper(IStudentDAO.class);

        Student stu=new Student();
        stu.setSname("张靓颖222");
        stu.setGid(1);
        System.out.println(stu.getSid());

        int count= studentDAO.addStudentAndReturnMaxValue(stu);
        //千万别忘了提交事务，真正的能影响数据记录的最后一道关卡，事务的提交与回滚
        session.commit();
        System.out.println(stu.getSid());
        if (count>0){
            System.out.println("update ok");
        }else{
            System.out.println("add failed");
        }

    }


}
