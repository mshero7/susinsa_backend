package com.cafe24.susinsa.config.web;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;


// WebMvcConfigurerAdapter을 통해 복잡한것의 객체를 받아 만들어낼수 있다.
@Configuration
@EnableWebMvc
public class MVCConfig extends WebMvcConfigurerAdapter{
	//
	// View Resovler
	// 뷰리졸버만 만들고 리턴해주면 된다.
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);

		return resolver;
	}

	//
	// Default Servlet Handler
	//
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	//
	// Message Converter
	//
	
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		// JSON 문자열을 만들때 예쁘게 만들으라고 indentOutput
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder().
				indentOutput(true)
				.dateFormat(new SimpleDateFormat("yyyy-MM-dd"))
				.modulesToInstall( new ParameterNamesModule() );
		
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(builder.build());
		converter.setSupportedMediaTypes(Arrays.asList(new MediaType("application","json",Charset.forName("utf-8"))));
		
		return converter;
	}
	
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		StringHttpMessageConverter converter = new StringHttpMessageConverter();
		converter.setSupportedMediaTypes(Arrays.asList(new MediaType("text","html",Charset.forName("utf-8"))));
		
		return converter;
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(mappingJackson2HttpMessageConverter());
	}
	
}
