package cn.springmvc.day06annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.ElementType;

/**
 * @Classname AnnotationController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/26 9:36
 * @Created by Happy-微冷的雨
 */
@Controller
//AnnotationController已经有对象了  ，对象名(annotationController)
@RequestMapping("/order")
public class OrderController {
      @RequestMapping(value = "/list",method = RequestMethod.POST)
      public String list(){
          System.out.println("list");
          return "/orderlist.jsp";
      }
}
