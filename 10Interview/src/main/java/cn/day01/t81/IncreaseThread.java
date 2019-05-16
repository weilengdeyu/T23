package cn.day01.t81;

/**
 * @Classname IncreaseThread
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/15 15:39
 * @Created by Happy-微冷的雨
 */
public class IncreaseThread extends Thread {
    private NumberHolder numberHolder;

    public IncreaseThread(NumberHolder numberHolder) {
        this.numberHolder = numberHolder;
    }

    //重写run方法
    @Override
    public void run() {

        for (int i=0;i<2;i++){
            try {
                Thread.sleep((long)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberHolder.increase();
        }

    }
}
