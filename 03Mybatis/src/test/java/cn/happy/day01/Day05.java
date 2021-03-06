package cn.happy.day01;

import cn.happy.dao.IStudentDAO;
import cn.happy.entity.Student;
import cn.happy.entity.viewmodel.StudentCondition;
import cn.happy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname Day01
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/2 12:17
 * @Created by Happy-微冷的雨
 */
public class Day05 {
    ////if tag
    @Test
    public  void testIf() throws IOException {

        SqlSession session = MybatisUtil.getSession();
        IStudentDAO dao = session.getMapper(IStudentDAO.class);
        Student stu=new Student();
        //stu.setSname("小吴");
        List<Student> list = dao.ifTag(stu);
        System.out.println(list.size());
        for (Student item:list){
            System.out.println(item.getSname());
        }
    }

    ////multi select  map
    @Test
    public  void testMultiMap() throws IOException {

        SqlSession session = MybatisUtil.getSession();
        IStudentDAO dao = session.getMapper(IStudentDAO.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("mysname","小");
        map.put("myaddress","日本");
        List<Student> list = dao.selectByMap(map);
        for (Student item:list){
            System.out.println(item.getSname());
        }
    }

    //multi select  condition
    @Test
    public  void testMultiCondition() throws IOException {
        SqlSession session = MybatisUtil.getSession();
        IStudentDAO dao = session.getMapper(IStudentDAO.class);
        StudentCondition stu=new StudentCondition();
        stu.setSname("小");
        stu.setAddress("日本");
        List<Student> list = dao.selectByCondition(stu);
        for (Student item:list){
            System.out.println(item.getSname());
            System.out.println(item.getAddress());

            //我将打印的内容写出来   item.getSname().sout():::::::::
        }
        Integer num=1; //判定一个对象是否是null  ，直接写对象名.null,形成如下代码
        if (num == null) {

        }
    }


}
