package cn.tfs.service;

import cn.tfs.entity.TeachFeedBack;

import java.util.List;

/**
 * @Classname ITeachFeedBackService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/6 12:58
 * @Created by Happy-微冷的雨
 */

public interface ITeachFeedBackService {
   public int addFeedBack(TeachFeedBack feedBack);
   List<TeachFeedBack> findAll();
   //根据主键获取单个对象
   public TeachFeedBack findFeedById(Integer id);
}
