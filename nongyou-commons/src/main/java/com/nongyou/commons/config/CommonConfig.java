package com.nongyou.commons.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CommonConfig {
	@Bean
	@ConditionalOnMissingBean({WebMvcConfigurerAdapter.class})
	public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
		return new WebConfig();
	}
}