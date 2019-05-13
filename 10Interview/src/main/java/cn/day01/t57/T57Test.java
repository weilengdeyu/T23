package cn.day01.t57;

import java.util.Calendar;

/**
 * @Classname T57Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/12 15:54
 * @Created by Happy-微冷的雨
 */
public class T57Test {
    /**
     * 写一个函数，2 个参数，1 个字符串，1 个字节数，返回截取的字符串，
     * 要求字符串中的中文不能出现乱码：如（“我ABC”，4）应该截为“我AB”，
     * 输入（“我ABC汉DEF”，6）应该输出为“我ABC”而不是“我ABC+汉的半个”。
     * @param args
     */
    public static void main(String[] args) {
       /* Calendar time = Calendar.getInstance();
        time.set(Calendar.DAY_OF_MONTH,
                time.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(time.get(Calendar.DAY_OF_MONTH));*/
       /* String result = subString("我ABC", 4);
        System.out.println(result);
        int cc=200;
        int zz='中';
        System.out.println((char) cc);*/

        /*String str= "测";
        char x =':';
        byte[] byteStr=null;
        byte[] byteChar=null;
        try {
            byteStr = str.getBytes("utf-8");
            byteChar = charToByte(x);
        } catch (Exception e) {

            e.printStackTrace();
        }
        //System.out.println("byteStr ："+byteStr.length);
        System.out.println("byteChar："+byteChar.length);*/
        String result = subString("好人ABC", 5);
        System.out.println(result);
    }
    public static String subString(String str, int subBytes) {
        String result=null;
        int count = 0; // 用来存储字符串的总字节数
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < 256) {
                count += 1; // 英文字符的字节数看作1
            } else {
                count += 2; // 中文字符的字节数看作2
            }
            if (count==subBytes){
                result= str.substring(0,i+1);
                break;
            }else if (count>subBytes){
                result= str.substring(0,i);
                break;
            }
        }
        return result;
    }
    public static byte[] charToByte(char c) {
        byte[] b = new byte[2];
        b[0] = (byte) ((c & 0xFF00) >> 8);
        b[1] = (byte) (c & 0xFF);
        return b;
    }
}
