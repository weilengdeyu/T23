package cn.day01.t79;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Classname T79Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/14 11:38
 * @Created by Happy-微冷的雨
 */
public class T79Test {
    public static void main(String[] args) {
        //不借助第三方变量实现两个变量值的交换， +   -   超出int最大范围
        //怎么解决？？？？
        //
        int num1=Integer.MAX_VALUE-1;
        int num2=Integer.MAX_VALUE-100;

        System.out.println(num1+"\t"+num2);

/*        num1+=num2;
        num2-=num1;//
        num1-=num2;//*/

        num1^=num2;//x先存x和y两者的信息
        System.out.println(num1);
        num2^=num1;//保持x不变，利用x异或反转y的原始值使其等于x的原始值
        num1^=num2;//保持y不变，利用x异或反转y的原始值使其等于y的原始值

        System.out.println(num1+"\t"+num2);

    }
    public static void tt(){
        //程序给出随便大小的10 个数，序号为1-10，按从小到大顺序输出
        //所有语言中  随机数  [0,100)
        Random random=new Random();
        List<Integer> list=new ArrayList<Integer>();
        for (int i=1;i<=10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println("排序前");
        System.out.println(list);

        Tool.bubbleSort(list);
        /*Collections.sort(list);*/

        System.out.println("排序后");
        System.out.println(list);
    }
}
