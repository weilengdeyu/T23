package cn.tfs.service;

import cn.tfs.entity.SysUser;

/**
 * @Classname ISysUserService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/6 12:24
 * @Created by Happy-微冷的雨
 */
public interface ISysUserService {
   //01.写一个登陆的方法
    public SysUser isLogin(SysUser sysUser);
}
