package com.example.shiro.core.service.system.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.shiro.common.bean.ResponseCode;
import com.example.shiro.common.exception.RequestException;
import com.example.shiro.core.dto.log.FindLogDTO;
import com.example.shiro.core.entity.SysLog;
import com.example.shiro.core.mapper.SysLogMapper;
import com.example.shiro.core.service.system.SysLogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Licoy
 * @version 2018/4/28/9:57
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper,SysLog> implements SysLogService {

    @Override
    public Page<SysLog> list(FindLogDTO findLogDTO) {
        EntityWrapper<SysLog> wrapper = new EntityWrapper<>();
        wrapper.orderBy("create_date",findLogDTO.getAsc());
        return this.selectPage(new Page<>(findLogDTO.getPage(),findLogDTO.getPageSize()),wrapper);
    }

    @Override
    public void remove(List<String> idList) {
        try {
            this.deleteBatchIds(idList);
        }catch (Exception e){
            throw new RequestException(ResponseCode.FAIL.code,"批量删除日志失败",e);
        }
    }
}
