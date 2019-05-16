package cn.day01.t81;

/**
 * @Classname  用于减少数字的线程
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/15 15:34
 * @Created by Happy-微冷的雨
 */
public class DecreaseThread extends Thread {
   // 维护一个numberHolder变量
    private NumberHolder numberHolder;
    //构造赋值
    public DecreaseThread(NumberHolder numberHolder)
    {
        this.numberHolder = numberHolder;
    }
    //重写run方法
    @Override
    public void run()
    {
        for (int i = 0; i < 2; ++i)  //循环20次
        {
            /**
             * 进行一定的延时
             */
            try
            {
                //线程休眠特定时间
                Thread.sleep((long) Math.random() * 1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            /**
             * 进行减少操作
             */
            numberHolder.decrease();
        }
    }


}
