package com.example.shiro.core.service.global;

import com.example.shiro.core.entity.SysResource;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Tinko
 * @Date: 2019/1/2 14:09
 * @Description: 获取拦截器数据
 */
public interface ShiroService {

    /**
     * 获取拦截器数据
     * @return
     */
    Map<String,String> getFilterChainDefinitionMap();

    /**
     * 迭代所有的资源子集
     * @param resource
     * @param permsList
     */
    void iterationAllResourceInToFilter(SysResource resource,
                                        List<String[]> permsList, List<String[]> anonList);

    /**
     * 重新加载权限
     */
    void reloadPerms();

    /**
     * 清除指定用户ID的授权信息
     * @param uid 用户ID
     * @param author 是否清空授权信息
     * @param out 是否清空session
     */
    void clearAuthByUserId(String uid,Boolean author, Boolean out);

    /**
     * 清除指定用户ID集合的授权信息
     * @param userList 用户ID集合
     * @param author 是否清空授权信息
     * @param out 是否清空session
     */
    void clearAuthByUserIdCollection(List<String> userList,Boolean author, Boolean out);
}
