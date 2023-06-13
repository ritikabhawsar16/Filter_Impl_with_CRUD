package com.filter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.filter.filters.MessageFilter;

@Configuration
public class FilterConfiguration {

	@Bean
	public FilterRegistrationBean<MessageFilter> registrationBean()
	{
		FilterRegistrationBean<MessageFilter> registrationBean=new FilterRegistrationBean<>(); 
		registrationBean.setFilter(new MessageFilter());		
		registrationBean.addUrlPatterns("/message/*");
		
		return registrationBean;
		
	}
}
