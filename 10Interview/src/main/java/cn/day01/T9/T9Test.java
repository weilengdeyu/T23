package cn.day01.T9;

/**
 * @Classname T9Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/6 10:29
 * @Created by Happy-微冷的雨
 */
public class T9Test {
    public String a(){
        b();
        return "1";
    }
    //方法也是有地址的
    public void b(){
        c();
        return;
    }
    //方法也是有地址的
    public void c(){

    }
    public static void main(String[] args) {
        T9Test tt=new T9Test();
        tt.a();
        tt.b();
        tt.c();
        //01.获取到int最大值怎么做？？？
        //解析：
       /* int maxInt=Integer.MAX_VALUE;*/
          /*int maxInt=2147483648;*/
       /* System.out.println(maxInt);*/
       /*
        byte maxByte=(byte)(Byte.MAX_VALUE+1);
        System.out.println(maxByte);*/

    }
}
