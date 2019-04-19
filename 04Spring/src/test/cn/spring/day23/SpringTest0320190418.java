package cn.spring.day23;


import cn.spring.day23tx.entity.MyException;
import cn.spring.day23tx.service.IStockService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Classname SpringTest0120190410
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/10 11:16
 * @Created by Happy-微冷的雨
 */
public class SpringTest0320190418 {

    @Test
    //购买股票案例
    public void testBuyStock(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day23.xml");
        //2.从容器中获取指定的bean
        IStockService stockService = ctx.getBean("stockService", IStockService.class);
        int count = 0;
        try {
            count = stockService.buyStock(1, 10, 1, 1000);
        } catch (MyException e) {
            e.printStackTrace();
        }
        if (count>0){
            System.out.println("购买成功！！！");
        }
    }
}
