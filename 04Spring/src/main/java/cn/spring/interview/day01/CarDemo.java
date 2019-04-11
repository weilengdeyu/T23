package cn.spring.interview.day01;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Classname CarDemo
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 15:16
 * @Created by Happy-微冷的雨
 */
//停车场案例
public class CarDemo {
    public static void main(String[] args) {
        //创建Semaphore
        Semaphore sp=new Semaphore(5);
        //请求许可
        //一个线程代表一辆汽车
        Thread[] cars=new Thread[10];
        for (int i=0;i<10;i++){
            try {
                TimeUnit.SECONDS.sleep(2);
                sp.acquire();
                System.out.println(Thread.currentThread().getName()+"");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //使用资源

        //释放资源

    }
}
