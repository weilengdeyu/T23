package cn.springmvc.day10pathviriable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname PathController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/26 11:58
 * @Created by Happy-微冷的雨
 */
@Controller
public class PathController {
  @RequestMapping("/path/{rname}")
  public String path(@PathVariable("rname") String name){
      System.out.println(name);
      return "/day10/index.jsp";
  }
}

