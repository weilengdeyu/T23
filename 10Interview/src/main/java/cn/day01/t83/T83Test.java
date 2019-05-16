package cn.day01.t83;

/**
 * @Classname T83Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/16 10:51
 * @Created by Happy-微冷的雨
 */
public class T83Test {
    public static void a(){
        System.out.println("加油");
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(){
            @Override
            public void run() {
                a();
            }
        };
        thread.start();//可执行  正在执行（拿到CPu时间片）
       // Thread.sleep(5);
        System.out.println("南京");

    }
}
