package com.cafe24.susinsa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.cafe24.susinsa.config.web.MVCConfig;
import com.cafe24.susinsa.config.web.SwaggerConfig;

@Configuration
@EnableAspectJAutoProxy
@EnableWebMvc
@ComponentScan({"com.cafe24.susinsa.controller"})
@Import({MVCConfig.class, SwaggerConfig.class})

public class WebConfig {

}
