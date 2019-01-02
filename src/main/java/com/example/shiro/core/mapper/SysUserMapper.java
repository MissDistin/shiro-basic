package com.example.shiro.core.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.shiro.core.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

}
