package com.example.shiro.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: Tinko
 * @Date: 2019/1/2 10:36
 * @Description: 验证该用户名下的token注解
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface JwtClaim {

    String value() default "username";

    boolean exception() default true;
}
