package com.sihenni.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

	@Bean
	public Samsung gtPhone() {
		
		return new Samsung();
	}
	
	@Bean
	public MobileCPU gtCpu() {
		return new ARM64();
	}
	
}
