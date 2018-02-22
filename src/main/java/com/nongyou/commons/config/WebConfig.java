package com.nongyou.commons.config;

import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.nongyou.commons.converter.StringToDateConverter;

public class WebConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addFormatters(FormatterRegistry registry) {
		super.addFormatters(registry);
		registry.addConverter(new StringToDateConverter());
	}
}
