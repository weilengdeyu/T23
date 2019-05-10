package cn.day01.t53;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @Classname T53Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/10 11:07
 * @Created by Happy-微冷的雨
 */
public class T53Test {
    public static void main(String[] args) {
       /* 1)如何将数值型字符转换为数字？
        2)如何将数字转换为字符？
        3)如何取小数点前两位并四舍五入? 【基础】*/
      /* String str="123";
       int num=Integer.parseInt(str);
        System.out.println(num);*/

      /*int num=5;
      String number=String.valueOf(num);
        System.out.println(number);*/
        double num=1.235;
        //财务数据
        BigDecimal number=new BigDecimal(num);
        BigDecimal result = number.round(new MathContext(3));
        System.out.println(result);


    }
}
