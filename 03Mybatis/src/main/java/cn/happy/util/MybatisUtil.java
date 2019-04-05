package cn.happy.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname MybatisUtil
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/3 10:44
 * @Created by Happy-微冷的雨
 */
public class MybatisUtil {
    //终极目标，获取到 session对象
    //对外提供一个方法，可以返回一个SqlSession类型的对象
    //session是从哪里来的，工厂

    static SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
    static InputStream is;
    static {
        try {
            is=Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static SqlSessionFactory factory=builder.build(is);

    public static SqlSession getSession(){
        //静态方法中不能直接访问非静态成员
        return factory.openSession();
    }
}
