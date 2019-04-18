package cn.spring.day22jdbctemplate.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @Classname RelectTool
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/17 13:44
 * @Created by Happy-微冷的雨
 */
//
/**反射工具类
  * @param <T>  入参实体的占位
 */
public class RelectTool<T> {
    /**
     *方法功能：定义一个队入参的实体各个属性赋值的方法
     * @param field  字段集合（数组）
     * @param model   实体对象模型 stock  Method method.invoke(对象名)
     * @param rs      读取器，
      */
    public  void setValue(Field[] fields, T model, ResultSet rs){
        try {
            //迭代所有的字段集合
            for (int i = 0; i < fields.length; i++) { // 遍历所有属性
                // 获取每个属性的名字  例如 bookname  bookprice
                String name = fields[i].getName();
                //将bookname处理成 Bookname
                name = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法
                //获取属性的类型  class java.lang.String
                String type = fields[i].getGenericType().toString(); // 获取属性的类型
               //如果是字符串类型
                if (type.equals("class java.lang.String")) { // 如果type是类类型，则前面包含"class "，后面跟类名
                    String value = rs.getString(name); // 调用getter方法获取属性值
                    //获取到该属性的set方法
                    Method method=model.getClass().getMethod("set"+name,String.class);
                    //通过反射的语法给set方法赋值
                    //model对象的setBookname赋值为value
                    method.invoke(model, value);
                }
                if (type.equals("class java.lang.Integer")) {
                    Integer value = rs.getInt(name); // 调用getter方法获取属性值
                    Method m=model.getClass().getMethod("set"+name,Integer.class);
                    m.invoke(model, value);
                   /* Method m = model.getClass().getMethod("get" + name);
                    Integer value = (Integer) m.invoke(model);
                    if (value == null) {
                        m = model.getClass().getMethod("set"+name,Integer.class);
                        m.invoke(model, value);
                    }*/
                }
                if (type.equals("class java.lang.Boolean")) {
                    Boolean value = rs.getBoolean(name); // 调用getter方法获取属性值
                    Method m=model.getClass().getMethod("set"+name,Boolean.class);
                    m.invoke(model, value);
                }
                if (type.equals("class java.util.Date")) {
                    Date value = rs.getDate(name); // 调用getter方法获取属性值
                    Method m=model.getClass().getMethod("set"+name,Date.class);
                    m.invoke(model, value);
                }
        // 如果有需要,可以仿照上面继续进行扩充,再增加对其它类型的判断
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
