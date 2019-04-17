package cn.spring.day21aspectjxml;

/**
 * @Classname MyAspect
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/16 11:12
 * @Created by Happy-微冷的雨
 */
public class MyAspect {
    //随手写一个方法
    //前置方法
    public void myBefore(){
        System.out.println("前置增强");
    }

    //后置方法
    public void myAfterReturning(){
        System.out.println("后置增强");
    }

}
