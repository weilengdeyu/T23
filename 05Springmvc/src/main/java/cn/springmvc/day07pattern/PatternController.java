package cn.springmvc.day07pattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname PatternController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/26 9:48
 * @Created by Happy-微冷的雨
 */
@Controller
public class PatternController {
    @RequestMapping("/*third")
    public String doFirst(){
        System.out.println("third");
        return "/day07/third.jsp";
    }

    //通配符：/**/ 无限极 目录  包含0级
    @RequestMapping("/**/four")
    public String doSecond(){
        System.out.println("four");
        return "/day07/four.jsp";
    }

    //通配符：/*/ 只能1级目录 不能为0级后者多级目录
    @RequestMapping("/*/five")
    public String doThird(){
        System.out.println("five");
        return "/day07/five.jsp";
    }
}
