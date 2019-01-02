package com.example.shiro.common.annotation;

import java.lang.annotation.*;

/**
 * @Auther: Tinko
 * @Date: 2019/1/2 10:38
 * @Description: 系统日志注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLogs {

    String value();
}
