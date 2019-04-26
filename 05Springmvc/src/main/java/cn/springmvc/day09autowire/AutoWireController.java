package cn.springmvc.day09autowire;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Classname AutoWireController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/26 11:00
 * @Created by Happy-微冷的雨
 */
@Controller
public class AutoWireController {
    //get
    @RequestMapping("/addUI")
    public String addUserUI(){
        return "/day09/addUser.jsp";
    }
   //POST
  @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(String uname,String upwd){
      System.out.println(uname);
      System.out.println(upwd);
      return "/day09/index.jsp";
  }

    //POST
    @RequestMapping(value = "/addPOJO",method = RequestMethod.POST)
    public String addUser(UserInfo info){
        System.out.println(info.getUname());
        System.out.println(info.getUpwd());

        System.out.println(info.getListAdresses().get(0).getHomeAddress());
        System.out.println(info.getListAdresses().get(1).getHomeAddress());
       // System.out.println(info.getAddress().getHomeAddress());
        return "/day09/index.jsp";
    }


}
