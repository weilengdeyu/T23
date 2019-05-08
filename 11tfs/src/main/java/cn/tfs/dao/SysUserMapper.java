package cn.tfs.dao;

import cn.tfs.entity.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    //01.写一个用于登陆的方法
    SysUser isLogin(SysUser sysUser);
}