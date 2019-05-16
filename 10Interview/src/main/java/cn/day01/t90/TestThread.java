package cn.day01.t90;

import java.io.Reader;

/**
 * @Classname TestThread
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/16 11:43
 * @Created by Happy-微冷的雨
 */
public class TestThread {
    private int j;
    public TestThread(int j) {
        this.j = j;
    }
    //增加
    private synchronized void inc(){
        j++;
        System.out.println(j + "--Inc--" + Thread.currentThread().getName());
    }
    //减少
    private synchronized void dec(){
        j--;
        System.out.println(j + "--Dec--" + Thread.currentThread().getName());
    }
    public void run() {
        (new Dec()).start();
        new Thread(new Inc()).start();
        (new Dec()).start();
        new Thread(new Inc()).start();
    }
    //减少1的线程
    class Dec extends Thread {
        public void run() {
            for(int i=0; i<100; i++){
                dec();
            }
        }
    }
    //增加1 的线程
    class Inc implements Runnable {
        public void run() {
            for(int i=0; i<100; i++){
                inc();
            }
        }
    }
    public static void main(String[] args) {
        (new TestThread(5)).run();
    }
}
