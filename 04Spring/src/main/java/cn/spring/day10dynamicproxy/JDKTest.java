package cn.spring.day10dynamicproxy;

import cn.spring.day09bean.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname JDKTest
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/15 10:10
 * @Created by Happy-微冷的雨
 */
public class JDKTest {
    public static void main(String[] args) {

      /*  TT obj=new TT();
        //
        obj.tt(new IRun() {
            @Override
            public void run() {

            }
        });*/
        //JDK动态代理
        final IHelloService helloService=new HelloServiceImpl();
        //Proxy
        IHelloService proxy=(IHelloService)Proxy.newProxyInstance(helloService.getClass().getClassLoader(),
                helloService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("log");
                Object result = method.invoke(helloService);
                System.out.println("=============="+result);
                return result;
            }
        });
        proxy.doSome();
    }
}
