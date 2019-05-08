package cn.tfs.service.impl;

import cn.tfs.dao.SysUserMapper;
import cn.tfs.entity.SysUser;
import cn.tfs.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname SysUserServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/5/6 12:25
 * @Created by Happy-微冷的雨
 */
@Service("userService")
public class SysUserServiceImpl implements ISysUserService{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser isLogin(SysUser sysUser) {
        return sysUserMapper.isLogin(sysUser);
    }
}
