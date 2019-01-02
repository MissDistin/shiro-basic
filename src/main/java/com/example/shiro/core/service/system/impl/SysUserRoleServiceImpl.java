package com.example.shiro.core.config.service.system.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.shiro.core.entity.SysUserRole;
import com.example.shiro.core.mapper.SysUserRoleMapper;
import com.example.shiro.core.service.system.SysUserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Licoy
 * @version 2018/4/16/11:32
 */
@Service
@Transactional
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper,SysUserRole> implements SysUserRoleService {
}
