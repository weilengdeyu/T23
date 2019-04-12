package cn.spring.day08staticproxy;

import java.lang.reflect.Proxy;

/**
 * @Classname MyMain
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/12 11:32
 * @Created by Happy-微冷的雨
 */
public class MyMain {
    public static void main(String[] args) {
        RealSubject realSubject=new RealSubject();
        ProxySubject proxySubject=new ProxySubject();
        proxySubject.setRealSubject(realSubject);
        String result = proxySubject.request();
        System.out.println(result);
    }
}
