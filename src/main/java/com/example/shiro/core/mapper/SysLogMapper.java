package com.example.shiro.core.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.shiro.core.entity.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Licoy
 * @version 2018/4/28/9:56
 */
@Mapper
@Repository
public interface SysLogMapper extends BaseMapper<SysLog> {
}
