package cn.spring.day23tx.entity;

/**
 * @Classname MyException
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/18 11:58
 * @Created by Happy-微冷的雨
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
