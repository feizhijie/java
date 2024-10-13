package com.fzj.thymeleaf.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author feizhijie
 * @date 2024/10/12
 */
@Configuration
@Slf4j
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        log.info("web注册");
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath*:/templates/", "classpath*:/templates/");
    }
}
