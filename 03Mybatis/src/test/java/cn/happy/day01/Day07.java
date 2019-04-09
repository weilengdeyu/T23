package cn.happy.day01;

import cn.happy.dao.ICategoryDAO;
import cn.happy.dao.IDeptDAO;
import cn.happy.dao.IEmpDAO;
import cn.happy.dao.IStudentDAO;
import cn.happy.entity.Category;
import cn.happy.entity.Dept;
import cn.happy.entity.Emp;
import cn.happy.entity.Student;
import cn.happy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname Day01
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/2 12:17
 * @Created by Happy-微冷的雨
 */
public class Day07 {


    //03.二级缓存
    @Test
    public void testSecondLevel() throws Exception {

        SqlSession session = MybatisUtil.getSession();
        IStudentDAO dao=session.getMapper(IStudentDAO.class);
        List<Student> list = dao.findAll();
        for (Student student:list){
            System.out.println(student.getSname());
        }
        MybatisUtil.closeSession(session);
        System.out.println("===========================");
     /* Movie mv=new Movie("奇门遁甲","奇门遁甲--导演","奇门遁甲--演员");
    dao.addMovie(mv);
    session.commit();*/

        SqlSession session2 = MybatisUtil.getSession();
        IStudentDAO dao2=session2.getMapper(IStudentDAO.class);

        List<Student> list2 = dao2.findAll();
        for (Student student:list2){
            System.out.println(student.getSname());
        }
        MybatisUtil.closeSession(session2);
        System.out.println("============================");
        SqlSession session3 = MybatisUtil.getSession();
        IStudentDAO dao3=session3.getMapper(IStudentDAO.class);

        List<Student> list3 = dao3.findAll();
        for (Student student:list3){
            System.out.println(student.getSname());
        }
        MybatisUtil.closeSession(session3);

    }

    //增删改对以一级缓存的影响     使缓存失效
    @Test
    public void testUpdateHasSomeThingToOneLevelCache() throws Exception {
        SqlSession session = MybatisUtil.getSession();
        IStudentDAO dao=session.getMapper(IStudentDAO.class);
        List<Student> list = dao.findAll();
        for (Student stu:list){
            System.out.println(stu.getSname());
        }

        Student student=new Student();
        student.setSname("增删改");
        student.setGid(1);
        student.setAddress("数据");

        dao.addStudent(student);
        session.commit();
        System.out.println("===========================");
        List<Student> list2 = dao.findAll();
        for (Student stu:list2){
            System.out.println(stu.getSname());
        }
    }

    //02.一级缓存存在性的证明
    @Test
    public void testLazyLoading() throws Exception {
        SqlSession session = MybatisUtil.getSession();
        IStudentDAO dao=session.getMapper(IStudentDAO.class);
        List<Student> list = dao.findAll();
        for (Student stu:list){
            System.out.println(stu.getSname());
        }

        System.out.println("===========================");

        List<Student> list2 = dao.findAll();
        for (Student stu:list2){
            System.out.println(stu.getSname());
        }

        System.out.println("===========================");

        List<Student> list3 = dao.findAll();
        for (Student stu:list3){
            System.out.println(stu.getSname());
        }
    }

    @Test
    //01.延迟加载
    public  void testLazyLoad() throws Exception {

        SqlSession session = MybatisUtil.getSession();
        IDeptDAO dao = session.getMapper(IDeptDAO.class);
        //前提条件  先决条件  单条SQL不会有延迟的，只有多条SQL才会使用延迟加载
         Dept dept = dao.getDeptByIdMultiSQL(1);
         //调度部门的名称属性  ，使用主对象属性  关联对象也会被加载出来，会发送第二条SQL
         System.out.println(dept.getDeptname());
        System.out.println(dept.getEmps());
        /*System.out.println(dept.getDeptname());*/
    }


}
