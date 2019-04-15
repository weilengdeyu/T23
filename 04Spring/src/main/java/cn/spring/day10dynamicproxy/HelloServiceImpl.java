package cn.spring.day10dynamicproxy;

/**
 * @Classname HelloServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/15 10:09
 * @Created by Happy-微冷的雨
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String doSome() {
        System.out.println("doSOme");
        return "T23无敌版";
    }
}
