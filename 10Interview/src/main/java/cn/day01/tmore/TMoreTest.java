package cn.day01.tmore;

/**
 * @Classname TMoreTest
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/9 10:19
 * @Created by Happy-微冷的雨
 */
public class TMoreTest {

    public static void main(String[] args) {
        String a="hello2";
        final String b=getHello();
        String c=b+2;
        System.out.println(a==c);
    }

    public static String getHello() {
        return "hello";
    }


   /* public static void main(String[] args) {
        String a="hello2";
        final String b="hello";
        String d="hello";
        String c=b+2;
        String e=d+2;
        System.out.println(a==c);
        System.out.println(a==e);
    }*/
}
