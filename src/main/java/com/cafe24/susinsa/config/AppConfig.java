package com.cafe24.susinsa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.susinsa.config.app.DBConfig;
import com.cafe24.susinsa.config.app.MyBatisConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.susinsa.service", "com.cafe24.susinsa.repository", "com.cafe24.susinsa.aspect"})
@Import({DBConfig.class, MyBatisConfig.class})
public class AppConfig {
}