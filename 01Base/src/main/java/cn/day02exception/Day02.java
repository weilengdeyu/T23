package cn.day02exception;

import java.io.File;
import java.io.IOException;

/**
 * @Classname Day02
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/1 10:50
 * @Created by Happy-微冷的雨
 */
public class Day02 {
    //异常给谁的  JVM  是把异常   给吞掉了，感知不到这个异常 ，不是规范的做法
    //程序员  code到最顶层  ，main不能用throws 将异常扔该JVM，一定是非顶层的时候
    public static void main(String[] args){
        //就是检查异常
        File file=new File("A:\\1.txt");
        try {
            //可能出现异常的代码
            file.createNewFile();
        } catch (IOException e) {
            //抓到异常
            //处理异常
            //处理异常
            //log4j   logger.info();
            //做的好的企业，日志发送邮件！！！！！

            e.printStackTrace();//打印异常的堆栈信息  说白了，就是异常的层级跟踪信息
        }
    }
}
