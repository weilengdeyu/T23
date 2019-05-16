package cn.day01.t81;

/**
 * @Classname NumberHolder
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/15 15:38
 * @Created by Happy-微冷的雨
 */
public class NumberHolder
{
    private int number;
    public synchronized void increase()
    {
        while (0 != number)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        // 能执行到这里说明已经被唤醒，并且number为0
        number++;
        System.out.println(number);

        // 通知在等待的线程
        notify();
    }

    public synchronized void decrease()
    {
        while (0 == number)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        // 能执行到这里说明已经被唤醒，并且number不为0
        number--;
        System.out.println(number);
        notify();
    }
}
