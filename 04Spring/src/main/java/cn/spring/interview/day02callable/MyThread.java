package cn.spring.interview.day02callable;

import java.util.concurrent.Callable;

/**
 * @Classname MyThread
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/11 8:32
 * @Created by Happy-微冷的雨
 */
public class MyThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        String th_name = Thread.currentThread().getName();
        return "子线程call方法";
    }
}
