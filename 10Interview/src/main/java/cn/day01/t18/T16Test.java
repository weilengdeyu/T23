package cn.day01.t18;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname T16Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/7 10:09
 * @Created by Happy-微冷的雨
 */
public class T16Test {
    public static void main(String[] args) {
/*

        MyThread t1=new MyThread();
        t1.start();
*/



        Set<UserInfo> set=new HashSet<UserInfo>();
        //两个不同的对象，但是对象的属性值完全相同，能不能添加到同一个set中
        UserInfo u1=new UserInfo("吴云飞","wyf222");
        int h1 = u1.hashCode();

        UserInfo u2=new UserInfo("吴云飞","wyf");
        int h2 = u2.hashCode();
        System.out.println(h1);
        System.out.println(h2);

        set.add(u1);
        set.add(u2);
        //HashSet是如何断定 现在要加入的对象在集合种是否存在的？
        //hashCode()  equals()
        /*1：会先调用对象的hashCode方法获得hash的值，如果set中哈希表里面没有对应的hash值，
        则将此对象存入set中

        2：如果set中hash表里面有对应的hash值，就让后面的对象调用equals方法和之前的hash值
        不同的对象进行比较，如果返回为true就证明存在，不在储存，入伙返回为false则视为新对象，
        加入到set中。
        */
        System.out.println(set.size()+"====================");
        for (UserInfo item:set){
            System.out.println(item.getUname()+"\t"+item.getUpwd());
        }
    }
}
