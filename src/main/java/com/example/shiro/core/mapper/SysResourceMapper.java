package com.example.shiro.core.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.shiro.core.entity.SysResource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Licoy
 * @version 2018/4/20/16:35
 */
@Mapper
@Repository
public interface SysResourceMapper extends BaseMapper<SysResource> {
}
