package cn.day01.t81;

import java.util.concurrent.TimeUnit;

/**
 * @Classname T81Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/15 15:29
 * @Created by Happy-微冷的雨
 */
public class T81Test {
    public static void main(String[] args) throws InterruptedException {
        //实例化一个NumberHolder
        NumberHolder numberHolder=new NumberHolder();
        //创建线程1
        Thread t1=new IncreaseThread(numberHolder);
        //创建线程2
        Thread t2=new DecreaseThread(numberHolder);
        //启动线程1
        t1.start();
        //启动线程2
        t2.start();
        Thread.sleep(1000);
        //TimeUnit设定时间
        TimeUnit.MINUTES.sleep(2);
    }
}
