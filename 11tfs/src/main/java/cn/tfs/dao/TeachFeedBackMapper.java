package cn.tfs.dao;

import cn.tfs.entity.TeachFeedBack;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.List;

public interface TeachFeedBackMapper {
    int deleteByPrimaryKey(Integer feedid);

    int insert(TeachFeedBack record);

    int insertSelective(TeachFeedBack record);

    //根据主键查询单个对象的方法
    TeachFeedBack selectByPrimaryKey(Integer feedid);

    int updateByPrimaryKeySelective(TeachFeedBack record);

    int updateByPrimaryKey(TeachFeedBack record);

    List<TeachFeedBack> findAll();
}