package com.example.shiro.core.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysRole implements Serializable  {

    @TableId
    private String id;
    
    private String name;

    @TableField(exist = false)
    private List<SysResource> resources;

    private static final long serialVersionUID = 1L;

}
