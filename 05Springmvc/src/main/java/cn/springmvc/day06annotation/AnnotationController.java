package cn.springmvc.day06annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname AnnotationController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/26 9:36
 * @Created by Happy-微冷的雨
 */
@Controller
//AnnotationController已经有对象了  ，对象名(annotationController)
@RequestMapping("/user")
public class AnnotationController {
      @RequestMapping("/list")
      public String list(){
          System.out.println("list");
          return "/list.jsp";
      }

    @RequestMapping("/add")
    public String add(){
        System.out.println("list");
        return "/add.jsp";
    }

    @RequestMapping("/details")
    public String details(){
        System.out.println("list");
        return "/details.jsp";
    }
}
