package cn.springmvc.day08requestparameter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Classname ParameterController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/26 10:48
 * @Created by Happy-微冷的雨
 */
@Controller
public class ParameterController {
   @RequestMapping("/login")
  public String login(HttpSession session, Model model){
      // session.setAttribute("sname","admin");
       model.addAttribute("sname","admin");
       return "/day08/index.jsp";
  }
}
