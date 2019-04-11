package cn.spring.day03;

import cn.spring.day01.HelloService;
import cn.spring.day01.entity.Person;
import cn.spring.day02printer.Printer;
import cn.spring.day03aop.entity.User;
import cn.spring.day03aop.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname SpringTest0120190410
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 11:16
 * @Created by Happy-微冷的雨
 */
public class SpringTest0320190411 {
    //03.打印机案例
    @Test
    public void testPrinter(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day03.xml");
        //2.从容器中获取指定的bean
        IUserService service = ctx.getBean("userService", IUserService.class);
        service.saveUser(new User());

    }

}
