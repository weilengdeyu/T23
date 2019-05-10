package cn.day01.t30;

/**
 * @Classname T30Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/9 11:59
 * @Created by Happy-微冷的雨
 */
public class T30Test {
    static int num=3;
    public static void main(String[] args) {
        num=5;
        //静态方法只能访问静态成员,要想访问实例成员有两种做法：
        //01.实例成变成静态
        //02.先new对象 ，再调度
    }

    public void say(){}
}
