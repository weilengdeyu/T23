package cn.springmvc.day01.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname FirstController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/23 9:43
 * @Created by Happy-微冷的雨
 */
//怎么变成Controller
public class FirstController implements Controller {
    /**
     * 方法功能：请求处理器
     * @param httpServletRequest  request请求对象
     * @param httpServletResponse  response响应对象
     * @return 视图+模型 ModelAndView
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        /*逻辑视图名=========物理视图的一部分 ！！！！*/
        mv.setViewName("index");
        //addObject底层 request作用域  还是脱离不了作用域
        mv.addObject("info","第一个Springmvc程序，请多关照！222222222");
        return mv;
    }
}
