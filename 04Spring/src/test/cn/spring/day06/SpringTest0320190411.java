package cn.spring.day06;

import cn.spring.day05autowire.Emp;
import cn.spring.day06collection.BeanCollection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

/**
 * @Classname SpringTest0120190410
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 11:16
 * @Created by Happy-微冷的雨
 */
public class SpringTest0320190411 {
    //01.自动装配
    @Test
    public void testAutoWire(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day06.xml");
        //2.从容器中获取指定的bean
        BeanCollection collection= ctx.getBean("beanCollection", BeanCollection.class);
        Set<Object> list = collection.getProperties().keySet();
        for (Object item:list){
            System.out.println(item+"\t"+collection.getProperties().get(item));
        }
    }

}
