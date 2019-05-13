package cn.day01.t55;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * @Classname T55Test
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/12 15:34
 * @Created by Happy-微冷的雨
 */
public class T55Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        String s1 = "你好";
        String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
        System.out.println(s2);
*/

        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(uuid);


    }
}

