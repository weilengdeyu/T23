package cn.day01.t44;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname JdkDynamicProxy
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/10 10:06
 * @Created by Happy-微冷的雨
 */
public class JdkDynamicProxy {
    public static void main(String[] args) {
        //01.准备一个目标类
        ISomeService someService=new SomeServiceImpl();
        //02.从Proxy.静态方法
        ISomeService proxy = (ISomeService)Proxy.newProxyInstance(someService.getClass().getClassLoader(),
                someService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("之前");
                        method.invoke(someService);
                        return null;
                    }
                }
        );
        proxy.doSome();
    }
}
