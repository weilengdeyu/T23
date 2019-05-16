package cn.day01.t58;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Classname T58Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/13 13:56
 * @Created by Happy-微冷的雨
 */
public class T58Test {
    public static void main(String[] args) {
        //如何取得年月日、小时分秒？
        //日历对象
/*        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        //万分注意 ，Calendar获取的日期是0到11
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        int day = calendar.get(Calendar.DATE);
        System.out.println(day);
        //返回的是long
        long count =calendar.getTimeInMillis();
        System.out.println(count);*/

       /* Calendar time = Calendar.getInstance();
        time.set(Calendar.DAY_OF_MONTH, time.getActualMaximum(Calendar.DAY_OF_MONTH));
        int lastday = time.get(time.DAY_OF_MONTH);
        System.out.println(lastday);*/


       //Java API的使用
   /*     System.out.println("================");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        System.out.println(format);*/
    }
}
