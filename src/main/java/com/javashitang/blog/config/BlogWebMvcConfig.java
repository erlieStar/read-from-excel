package com.javashitang.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class BlogWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 添加映射路径
        registry.addMapping("/**")
                // 允许的域
                .allowedOrigins("*")
                // 允许携带cookie
                .allowCredentials(true)
                // 允许的请求方式
                .allowedMethods("GET","POST", "PUT", "DELETE")
                // 允许的请求头
                .allowedHeaders("*");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TranceInterceptor());
        registry.addInterceptor(new CostInterceptor());
    }
}
