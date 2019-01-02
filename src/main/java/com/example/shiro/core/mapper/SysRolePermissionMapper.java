package com.example.shiro.core.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.shiro.core.entity.SysRoleResource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Licoy
 * @version 2018/4/16/9:00
 */
@Mapper
@Repository
public interface SysRolePermissionMapper extends BaseMapper<SysRoleResource> {
}
