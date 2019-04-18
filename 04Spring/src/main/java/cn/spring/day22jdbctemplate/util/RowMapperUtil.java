package cn.spring.day22jdbctemplate.util;

import cn.spring.day22jdbctemplate.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Classname RowMapperUtil
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/17 13:36
 * @Created by Happy-微冷的雨
 */

/**
 * RowMapper工具类
 * @param <T>  入参实体类型
 */
public class RowMapperUtil<T> implements RowMapper<T> {

    //定义一个类型对象  类型的类型 T占位符的真实类型
    private Class clazz;
    //这是一个构造，他的作用是给成员变量赋初值
    public RowMapperUtil(){
        //从当前类型的类型中   剥离     参数对象类型
        ParameterizedType pt = (ParameterizedType) this.getClass().
                getGenericSuperclass();// 这里面的this代表的是子类的实例
        //将剥离到的参数类型的所有集合的第一项取出来，就是T占位的真实类型
        this.clazz = (Class) pt.getActualTypeArguments()[0];// 获取第一个类型参数的真实类型*/
        System.out.println(clazz+"********************clazz");
    }
    //定义个T类型的对象
    T obj;

    /**
     * mapRow实现接口的
     * @param rs  读取器
     * @param index  索引 ，记录下 标
     * @return   就是单个的实体数据
     * @throws SQLException
     */
    @Override
    public T mapRow(ResultSet rs, int index) throws SQLException {
        try {
            //通过反射的手段构建对象
            obj = (T)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //通过getDeclaredFileds（）去获取当前实体的所有属性集合，包括private修饰
        Field[] fields = clazz.getDeclaredFields();
        //调度赋值工具类，T占位继续下传
        RelectTool<T> tool=new RelectTool<T>();
        //入参构造好的Data
        tool.setValue(fields,obj,rs);
        return obj;
    }
}

