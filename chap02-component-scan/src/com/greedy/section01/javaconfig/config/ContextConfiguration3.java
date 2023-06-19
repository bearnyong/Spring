package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.greedy.section01.javaconfig.MemberDAO;

/* basePackage의 기본 설정 경로를 지정하고 userDefaultFilter를 galse로 하면 모든 어노테이션을 스캔하지 않는다.
 * 이 떄 스캔할 대상만 따로 지정할 수 있다.*/
@Configuration
@ComponentScan(basePackages = "com.greedy.section01.javaconfig",
		useDefaultFilters = false,
		includeFilters = {@ComponentScan.Filter(
				type = FilterType.ASSIGNABLE_TYPE,
				classes = {MemberDAO.class}
				)
		}
)
public class ContextConfiguration3 {

}
