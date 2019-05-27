import cn.hibernate.day01.Master;
import cn.hibernate.day01.Student;
import cn.hibernate.day01.Teacher;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

/**
 * @Classname Day01Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/24 10:27
 * @Created by Happy-微冷的雨
 */
public class Day02Test {

    //hibernate分页
    @Test
    public void testHibernatePagedList(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        /*Session session = factory.openSession();*/
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Student");
        query.setFirstResult(2);  //下标
        query.setMaxResults(2);//每页显示几条记录
        List<Student> list = query.list();
        tx.commit();
       for (Student stu:list){
           System.out.println(stu.getName());
       }
    }


    //测试UUID策略
    @Test
    public void testUUIDGenerator(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        /*Session session = factory.openSession();*/
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        //session上下文入口
        Master master=new Master();
        master.setMname("老张");
        UUID uuid = UUID.randomUUID();
        master.setMid(uuid.toString());
        session.save(master); //生成sql ，并没有执行。
        tx.commit();
        session.close();
        //数据不会保存
        System.out.println("save success!!!");
    }

    //添加年级
    @Test
    public void testAddTeacher(){
        //没有入参，默认会从classpath下加载名称为hibernate.cfg.xml文件
        Configuration config=new Configuration().configure();
        //02.构建工厂
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //session上下文入口
        Teacher teacher=new Teacher();
        teacher.setTname("无敌班级");
        teacher.setTid(223);
        session.save(teacher); //生成sql ，并没有执行。
        tx.commit();
        //数据不会保存
        System.out.println("save success!!!");
    }
}
