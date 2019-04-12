package cn.spring.day08staticproxy;

/**
 * @Classname RealSubject
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/12 11:29
 * @Created by Happy-微冷的雨
 */
public class RealSubject implements Subject{
    @Override
    public String request() {
       return "request";
    }
}
