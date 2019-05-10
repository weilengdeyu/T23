package cn.day01.t45;

/**
 * @Classname Outer
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/9 20:29
 * @Created by Happy-微冷的雨
 */
public class Outer {
    static  int  num =3;
    private static class Inner{
        int age=20;
        void InnerMethod(){
            int i = num;
            System.out.println(i);
        }
    }
}