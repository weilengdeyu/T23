package cn.day01.t59;

import java.util.Calendar;

/**
 * @Classname T59Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/13 14:02
 * @Created by Happy-微冷的雨
 */
public class T59Test {
    public static void main(String[] args) {
        //打印昨天的当前时刻
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());

    }
}
