package com.example.shiro.core.service.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.example.shiro.common.service.QueryService;
import com.example.shiro.core.dto.log.FindLogDTO;
import com.example.shiro.core.entity.SysLog;

import java.util.List;

/**
 * @author Licoy
 * @version 2018/4/28/9:56
 */
public interface SysLogService extends IService<SysLog>,QueryService<SysLog,FindLogDTO>
{

    Page<SysLog> list(FindLogDTO findLogDTO);

    void remove(List<String> idList);

}
