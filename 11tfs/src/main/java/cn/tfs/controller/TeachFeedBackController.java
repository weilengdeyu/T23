package cn.tfs.controller;

import cn.tfs.entity.TeachFeedBack;
import cn.tfs.service.ITeachFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Classname TeachFeedBackController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/6 13:01
 * @Created by Happy-微冷的雨
 */
//反馈控制层
@Controller
public class TeachFeedBackController {
    @Autowired
    //teachFeedBackService 只是一个符号  占位
    private ITeachFeedBackService teachFeedBackService;

    //03.根据id查询单个对象
    @RequestMapping("/findFeedById")
    public String findFeedById(Model model,Integer id){
        TeachFeedBack teachFeedBack = teachFeedBackService.findFeedById(id);
        model.addAttribute("feedBack",teachFeedBack);
        return "/jsp/feedback_look.jsp";
    }

 /*   public void test(){
        TeachFeedBack teachFeedBack=new TeachFeedBack();
        addFeedBack(teachFeedBack);
    }*/

    //02.添加反馈信息
    @RequestMapping("/addFeedBack")
    @ResponseBody
    public Object addFeedBack(TeachFeedBack teachFeedBack){
        teachFeedBack.setFeeddate(new Date());//默认服务器时间作为反馈
        teachFeedBack.setFeedstatus(1);
        teachFeedBack.setFeedisdelete(false);
        int result = teachFeedBackService.addFeedBack(teachFeedBack);
        if (result>0){
            return "success";
        }else{
            return "failed";
        }
    }

    //01.查询所有记录
    @RequestMapping("/findAll")
    public String  findAll(Model model){
        List<TeachFeedBack> list = teachFeedBackService.findAll();
        model.addAttribute("list",list);
        return "/jsp/feedback.jsp";
    }
}
