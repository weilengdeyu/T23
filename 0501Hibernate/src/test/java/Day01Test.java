import cn.hibernate.day01.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

/**
 * @Classname Day01Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/24 10:27
 * @Created by Happy-微冷的雨
 */
public class Day01Test {
    //查询学生  load  延迟加载
    @Test
    public void testAllStudent(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Query query = session.createQuery("select  name,age from Student"); //Linq
        List<Object[]> list = query.list();
        for (Object[] stu:list){
            System.out.println(stu[0]+"\t"+stu[1]);

        }
    }

    //删除学生
    @Test
    public void testDeleteStudent(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //session上下文入口
        Student stu = session.load(Student.class,3);
        session.delete(stu); //生成sql ，并没有执行。
        tx.commit();
        //数据不会保存
        System.out.println("delete success!!!");
    }



    //方式二：修改学生
    @Test
    public void testSaveOrUpdateStudent(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //session上下文入口
        Student stu = new Student();
        stu.setName("李杰55555555");
        stu.setAge(33);
        stu.setId(3);
        session.saveOrUpdate(stu); //生成sql ，并没有执行。
        tx.commit();
        //数据不会保存
        System.out.println("update success!!!");
    }



    //查询学生  load  延迟加载
    @Test
    public void testReadStudent(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Student stu = session.load(Student.class, 1);
        System.out.println(stu.getId());
        /*System.out.println(stu.getName());*/
    }

    //查询学生
    @Test
    public void testGetStudent(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Student stu = session.get(Student.class, 1);
       /* System.out.println(stu);
        System.out.println(stu.getName());*/
    }

    //方式二：修改学生
    @Test
    public void testUpdate2Student(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //session上下文入口
        Student stu = session.load(Student.class, 1);
        stu.setName("李杰3");
        session.update(stu); //生成sql ，并没有执行。
        tx.commit();
        //数据不会保存
        System.out.println("update success!!!");
    }

    //修改学生
    @Test
    public void testUpdateStudent(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //session上下文入口
        Student stu=new Student();
        stu.setName("李杰2");
        //stu.setAge(12);
        stu.setId(1);
        session.update(stu); //生成sql ，并没有执行。
        tx.commit();
        //数据不会保存
        System.out.println("update success!!!");
    }

    //添加学生
    @Test
    public void testAddStudent(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //session上下文入口
        Student stu=new Student();
        stu.setName("无敌班级");
        stu.setAge(223);
        session.save(stu); //生成sql ，并没有执行。
        tx.commit();
        //数据不会保存
        System.out.println("save success!!!");
    }
}
