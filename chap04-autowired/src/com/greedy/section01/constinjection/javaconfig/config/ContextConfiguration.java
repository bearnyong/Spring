package com.greedy.section01.constinjection.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.greedy.section01.constinjection.javaconfig.RandomGenerator;
import com.greedy.section01.constinjection.javaconfig.RandomNumberGenerator;

@Configuration
@ComponentScan(basePackages="com.greedy.section01.constinjection.javaconfig")
public class ContextConfiguration {
	
	@Bean
	public RandomGenerator randomGenerator() throws Exception {
		return new RandomNumberGenerator(1,10);
	}
}
