package cn.day01.t64;

/**
 * @Classname t64Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/13 14:50
 * @Created by Happy-微冷的雨
 */
public class t64Test {
    public static void main(String[] args) {
        int result=test();
        System.out.println(result);
    }
    public static int test(){
        int num=2;
        try {
            int result=5/0;
            System.out.println("try");
            //return num++;  //开辟了新空间   ，把2放入新开辟的空间
        }catch (Exception ex){
            System.out.println("catch");
            //Java 虚拟机退出
           // System.exit(0);
            return num++;
        } finally {
            num++;
            System.out.println(num);
            System.out.println("我是finally");
            return num++;
        }
    }
}
