package com.cafe24.susinsa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.cafe24.susinsa.service", "com.cafe24.susinsa.repository", "com.cafe24.susinsa.aspect"})
public class AppConfig {
}