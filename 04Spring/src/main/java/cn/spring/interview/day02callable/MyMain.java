package cn.spring.interview.day02callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Classname MyMain
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/11 8:32
 * @Created by Happy-微冷的雨
 */
public class MyMain {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        FutureTask<String> ft=new FutureTask<String>(t1);
        Thread tt=new Thread(ft,"子线程");
        tt.start();
        Thread.currentThread().setName("父线程");
        try {
            System.out.println(Thread.currentThread().getName() + "休整5000ms");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "休整完毕..");
        try {
            String str = ft.get();// 利用FutureTask对象调用get()方法获取子线程的返回值
            System.out.println(Thread.currentThread().getName() + "获取子线程消息===="
                    + str);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
