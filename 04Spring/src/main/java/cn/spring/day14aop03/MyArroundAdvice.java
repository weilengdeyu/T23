package cn.spring.day14aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Classname MyArroundAdvice
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/15 12:03
 * @Created by Happy-微冷的雨
 */
public class MyArroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //前
        System.out.println("前");
        Object result = invocation.proceed();
        //后
        System.out.println("后");
        return result;
    }
}
