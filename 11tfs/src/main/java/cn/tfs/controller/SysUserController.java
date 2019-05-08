package cn.tfs.controller;

import cn.tfs.entity.SysUser;
import cn.tfs.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Classname SysUserController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/6 12:26
 * @Created by Happy-微冷的雨
 */
@Controller
public class SysUserController {
    //植入Service
    @Autowired
    private ISysUserService sysUserService;

    //02.写一个注销的方法
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //01.清理session
        session.removeAttribute("user");
        //02.页面跳转
        return "/jsp/login.jsp";
    }

    //01.写一个用于登陆的方法
    @RequestMapping("/login")
    public String isLogin(SysUser sysUser,HttpSession session){
        SysUser info = sysUserService.isLogin(sysUser);
        if (info!=null&&!("").equals(info.getUname())){
            //登陆成功
            session.setAttribute("user",info);
            return "/jsp/index.jsp";
        }else{
            //登陆失败
            return "/jsp/login.jsp";
        }
    }
}
