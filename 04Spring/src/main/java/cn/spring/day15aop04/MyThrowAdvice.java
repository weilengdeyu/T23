package cn.spring.day15aop04;

import org.springframework.aop.ThrowsAdvice;

/**
 * @Classname MyThrowAdvice
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/15 12:06
 * @Created by Happy-微冷的雨
 */
public class MyThrowAdvice implements ThrowsAdvice{
    public void afterThrowing(Exception ex){
        System.out.println(ex.getMessage()+"===============出错了");
    }
}
