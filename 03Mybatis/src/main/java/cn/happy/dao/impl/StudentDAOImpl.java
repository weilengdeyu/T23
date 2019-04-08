package cn.happy.dao.impl;

import cn.happy.dao.IStudentDAO;
import cn.happy.entity.Student;
import cn.happy.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Classname StudentDAOImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/2 12:09
 * @Created by Happy-微冷的雨
 */
public class StudentDAOImpl  {

    public List<Student> findAll() throws IOException {
        //写具体代码
        String path="mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(path);
        //01。SQLSessionFactoryBuilder
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //02.工厂
        SqlSessionFactory factory = builder.build(is);
        //03.交互通道 session
        SqlSession session = factory.openSession();

        //04.调度session执行SQL
        List<Student> list = session.selectList("findAll");

        return list;
    }


    public Student findById(Integer id) throws IOException {
        //03.交互通道 session
        SqlSession session = MybatisUtil.getSession();
        Student stu = session.selectOne("findById", id);
        return stu;
    }


    public int addStudent(Student student) {
        return 0;
    }


    public int updateStudent(Student student) {
        return 0;
    }


    public int deleteStudent(Integer sid) {
        return 0;
    }
}
