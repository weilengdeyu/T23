package cn.spring.day21;

import cn.spring.day21aspectjxml.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname SpringTest0120190410
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 11:16
 * @Created by Happy-微冷的雨
 */
public class SpringTest0320190416 {
    @Test
    public void testAutoWire(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day21.xml");
        //2.从容器中获取指定的bean
        SomeService service= (SomeService)ctx.getBean("someService");
        service.add();
        System.out.println("==============================");
        service.list();
    }
}
