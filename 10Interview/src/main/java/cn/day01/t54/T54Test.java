package cn.day01.t54;

/**
 * @Classname T54Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/10 11:27
 * @Created by Happy-微冷的雨
 */
public class T54Test {
    public static void main(String[] args) {
        String str="abcdef";
        String result = reverse(str.toCharArray());
        System.out.println(result);
    }
    public  static String reverse(char[] value){
        //折半，从中间开始置换
        for (int i = (value.length - 1) >> 1; i >= 0; i--){
            char temp = value[i];
            value[i] = value[value.length - 1 - i];
            value[value.length - 1 - i] = temp;
        }
        return new String(value);
    }
    public void m1(){
        String str="abcdef";
           /*  StringBuffer sb=new StringBuffer(str);
        StringBuffer result = sb.reverse();
        System.out.println(result);*/
        //拿到abcdef的回文    反转
        //01.字符串看成字符数组
        char[] charOld = str.toCharArray();
        //02.新的数组  或者集合
        char[] charNew = new char[charOld.length];
        //03.遍历数组
        for(int i=0;i<charOld.length;i++){
            //
            charNew[i] = charOld[charOld.length-1-i];
        }
        //04.将字符数组 转成字符串
        String result=String.valueOf(charNew);
        //05.打印
        System.out.println(result);

    }
}
