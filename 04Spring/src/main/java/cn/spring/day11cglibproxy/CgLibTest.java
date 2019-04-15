package cn.spring.day11cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname CgLibTest
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/15 11:02
 * @Created by Happy-微冷的雨
 */
public class CgLibTest {
    public static void main(String[] args) {

        final HelloService helloService=new HelloService();
        //CGLIB动态
        Enhancer enhancer=new Enhancer();
        //1.设置superClass 父类
        enhancer.setSuperclass(helloService.getClass());
        //2.设置 setCallback
        enhancer.setCallback(new MethodInterceptor() {
            /**
             *
             * @param  目标对象
             * @param 目标对象的方法
             * @param 参数集合
             * @param methodProxy 代理对象方法
             * @return  返回值
             * @throws Throwable
             */
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("before");

                Object result = methodProxy.invoke(helloService, args);
                System.out.println("after"+result);
                return result;
            }
        });

        //3.create创建对象
        HelloService proxy= (HelloService)enhancer.create();
        proxy.doSome();

    }
}
