package cn.springmvc.day03multiaction;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname MyMultiActionController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/24 10:40
 * @Created by Happy-微冷的雨
 */
public class MyMultiActionController extends MultiActionController {
    //方法得是public
    //方法入参request，response
    //自定义方法
    public String doAdd(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        return "add";
    }

    public String doDelete(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return "delete";
    }


}
