package cn.tfs.filter;

import cn.tfs.util.WaterPress;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/8 14:55
 * @Created by Happy-微冷的雨
 */
@WebFilter(filterName = "WaterMarkFilter")
public class WaterMarkFilter implements Filter {

    private  FilterConfig filterConfig;
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        // 获取请求中的图片路径
        String filePath = req.getServletPath();// 这是相对路径(并且包括了上下文路径)
        String fileRealPath = filterConfig.getServletContext().getRealPath(filePath);// 得到绝对路径
        System.out.println("==============执行了");
// 调用工具类加水印(由于是动态从流中加水印，因此不会修改服务器上原图片)
        WaterPress.pressText("五道口学院", fileRealPath, "宋体", 1, Color.RED.getRGB(),
                55, 180, 580, response.getOutputStream(),30,new Color(238, 39, 29));

        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig=config;
    }

    public void destroy() {
    }

}
