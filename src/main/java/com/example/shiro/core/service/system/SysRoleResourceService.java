package com.example.shiro.core.service.system;

import com.baomidou.mybatisplus.service.IService;
import com.example.shiro.core.entity.SysResource;
import com.example.shiro.core.entity.SysRoleResource;

import java.util.List;

/**
 * @author Licoy
 * @version 2018/4/16/9:01
 */
public interface SysRoleResourceService extends IService<SysRoleResource> {

    List<SysResource> findAllResourceByRoleId(String rid);

}
