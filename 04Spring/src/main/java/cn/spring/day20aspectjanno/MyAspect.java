package cn.spring.day20aspectjanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Classname MyAspect
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/16 10:58
 * @Created by Happy-微冷的雨
 */
//切面=========切点+增强
//普通类如何能处理请求  给出响应
 //该类是一个切面类
@Aspect
public class MyAspect {
   /* //前置增强
    @Before(value ="execution(* *..*.day20aspectjanno.SomeService.*(..))")
    public void myBefore(){
        System.out.println("这是前置增强");
    }

    //后置增强
    @AfterReturning(value ="execution(* *..*.day20aspectjanno.SomeService.*(..))")
    public void myAfterReturing(){
        System.out.println("这是后置增强============");
    }*/

    //环绕增强
    @Around(value ="execution(* *..*.day20aspectjanno.SomeService.*(..))")
    public void myAround(ProceedingJoinPoint joinPoint){
        //找到一个隔离点
        System.out.println("环绕增强=========方法执行前");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕增强=========方法执行后");
    }
}
