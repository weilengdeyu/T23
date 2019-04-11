package cn.spring.day04;

import cn.spring.day03aop.entity.User;
import cn.spring.day03aop.service.IUserService;
import cn.spring.day04xmldi.UserInfo;
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
    //01.基于构造的DI
    @Test
    public void testDIContructor(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day04.xml");
        //2.从容器中获取指定的bean
        UserInfo uinfo = ctx.getBean("uinfo", UserInfo.class);
        System.out.println(uinfo);
    }

}
