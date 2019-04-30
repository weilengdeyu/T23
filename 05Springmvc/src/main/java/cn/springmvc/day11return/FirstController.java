package cn.springmvc.day11return;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname FirstController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/28 21:42
 * @Created by Happy-微冷的雨
 */
@Controller
public class FirstController {

    @RequestMapping(value = "/first",produces = "application/json;charset=utf-8")
    public void doFirst(HttpServletResponse response) throws IOException {
        List<UserInfo> list=new ArrayList<UserInfo>();

        UserInfo u1=new UserInfo();
        u1.setName("微冷的雨");
        u1.setAge(23);

        UserInfo u2=new UserInfo();
        u2.setName("开智小站");
        u2.setAge(13);

        list.add(u1);
        list.add(u2);

        //手握泛型 ，转向json
        //使用工具fastjson ，一键转 Json.toJsonString(list)
        String json = JSON.toJSONString(list);
        //将data发送到浏览器
        response.getWriter().write(json);
    }
    @RequestMapping(value = "/second",produces = "text/html;charset=utf-8")
    @ResponseBody
    public Object doSecond() throws IOException {
       return "Springmvc Json自动回送";
    }

    @RequestMapping(value = "/third")
    @ResponseBody
    public List<UserInfo> doThird() throws IOException {
        List<UserInfo> list=new ArrayList<UserInfo>();

        UserInfo u1=new UserInfo();
        u1.setName("微冷的雨");
        u1.setAge(23);

        UserInfo u2=new UserInfo();
        u2.setName("开智小站");
        u2.setAge(13);

        list.add(u1);
        list.add(u2);
        return list;
    }
}
