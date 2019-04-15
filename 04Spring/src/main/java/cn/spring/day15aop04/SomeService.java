package cn.spring.day15aop04;

public class SomeService {
    public void  add() throws Exception {
        System.out.println("add");
        throw new Exception("throw出去一个异常");
    }
}
