package cn.springmvc.day05viewresolver;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname MyViewResolverController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/24 11:35
 * @Created by Happy-微冷的雨
 */
public class MyViewResolverController extends MultiActionController {
    public String doInner(HttpServletRequest request, HttpServletResponse response){
        return "inner";
    }
    public String doOuter(HttpServletRequest request, HttpServletResponse response){
        return "outer";
    }

}
