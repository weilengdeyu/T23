package cn.springmvc.day02handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname MyAbstractController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/24 10:13
 * @Created by Happy-微冷的雨
 */
public class MyAbstractController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        /*逻辑视图名=========物理视图的一部分 ！！！！*/
        mv.setViewName("index");
        //addObject底层 request作用域  还是脱离不了作用域
        mv.addObject("info","第一个Springmvc程序，请多关照！222222222");
        return mv;
    }
}
