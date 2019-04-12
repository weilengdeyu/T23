package cn.spring.day08staticproxy;

/**
 * @Classname ProxySubject
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/12 11:30
 * @Created by Happy-微冷的雨
 */
public class ProxySubject implements Subject{
    private RealSubject realSubject;
    @Override
    public String request() {

        String content="我是增强内容";
        String request = realSubject.request();
        return request+content;
    }

    public RealSubject getRealSubject() {
        return realSubject;
    }

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
}
