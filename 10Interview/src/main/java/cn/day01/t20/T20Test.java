package cn.day01.t20;

import java.util.Scanner;

/**
 * @Classname T20Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/7 16:25
 * @Created by Happy-微冷的雨
 */
public class T20Test {
    public static void main(String[] args) {
        //Java中只有对比两个字符串内容是否相等必须用equals
        Scanner input=new Scanner(System.in);
        System.out.println("亲，请输入一个字符串");
        String uname=input.next();
        System.out.println("admin"==uname);
    }
}
