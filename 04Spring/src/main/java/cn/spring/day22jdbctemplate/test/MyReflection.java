package cn.spring.day22jdbctemplate.test;

import cn.spring.day22jdbctemplate.entity.Book;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @Classname MyReflection
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 9:57
 * @Created by Happy-微冷的雨
 */
public class MyReflection {
    public static void main(String[] args) {
        //通过反射机制，获取到BookInfo 中  属性集合
        //获取类型的类型  BookInfo  反射 Class
        Class clazz= BookInfo.class;
        Field[] fileds = clazz.getDeclaredFields();
        for (Field item:fileds){
            System.out.println(item.getName());
        }
        //---------------------------
      /*  File file=new File("C:\\斗鱼视频");
        File[] files = file.listFiles();
        for (File item:files){
            System.out.println(item.getName());
        }*/
    }
}
