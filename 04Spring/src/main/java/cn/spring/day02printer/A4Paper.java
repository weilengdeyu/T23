package cn.spring.day02printer;

/**
 * @Classname A4Paper
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 12:01
 * @Created by Happy-微冷的雨
 */
public class A4Paper implements Paper {
    @Override
    public String getSize() {
        return "A4Paper";
    }
}
