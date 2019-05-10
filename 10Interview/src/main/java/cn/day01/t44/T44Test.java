package cn.day01.t44;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @Classname T44Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/9 19:37
 * @Created by Happy-微冷的雨
 */
public class T44Test {
    public static void main(String[] args) {
        /*MyThread t1=new MyThread();
        t1.start();
        */


        /*MyThreadRun t1=new MyThreadRun();
        Thread tt=new Thread(t1);
        tt.start();
        */
        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        }.start();

       //swing Javaweb  窗体
        //app
       new Thread(new Runnable() {
           @Override
           public void run() {

           }
       }).start();



    }
}
