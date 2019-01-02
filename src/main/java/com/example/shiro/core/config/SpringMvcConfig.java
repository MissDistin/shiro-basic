package com.example.shiro.core.config;

import com.example.shiro.common.resoler.JwtTokenArgumentResolver;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @Auther: Tinko
 * @Date: 2019/1/2 13:58
 * @Description:
 */
@SpringBootConfiguration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new JwtTokenArgumentResolver());
    }
}
