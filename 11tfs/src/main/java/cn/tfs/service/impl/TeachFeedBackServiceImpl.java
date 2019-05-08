package cn.tfs.service.impl;

import cn.tfs.dao.TeachFeedBackMapper;
import cn.tfs.entity.TeachFeedBack;
import cn.tfs.service.ITeachFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname TeachFeedBackServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/6 13:00
 * @Created by Happy-微冷的雨
 */
@Service("teachFeedBackService")
public class TeachFeedBackServiceImpl implements ITeachFeedBackService {
    @Autowired
    private TeachFeedBackMapper teachFeedBackMapper;
    @Override
    public int addFeedBack(TeachFeedBack feedBack) {
        return teachFeedBackMapper.insertSelective(feedBack);
    }

    @Override
    public List<TeachFeedBack> findAll() {
        return teachFeedBackMapper.findAll();
    }

    @Override
    public TeachFeedBack findFeedById(Integer id) {
        return teachFeedBackMapper.selectByPrimaryKey(id);
    }
}
