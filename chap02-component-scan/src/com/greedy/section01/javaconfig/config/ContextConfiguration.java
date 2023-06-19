package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;

/* 스프링이 스캐닝으로 인시가할 수 있는 컴포넌트는 @Component(컴포넌트)이며, @Configuration도 @Component를 상속받았다.
 * @Configuration
 * public class ContextConfiguration {
 * 
 * }
 * */

/* 추가로 설정할 것은 없다.
 * 이유는 @Component로 이미 Bean등록을 완료하였기 떄문이다.*/

/* basePackages에 등록되지 않은 패키지는 스캔에서 제외하고, 등록된 패키지 내의 @Component 어노테이션을 탐색한다.
 * 이 떄 basePackage를 등록하지 않으면 현 설정클래스가 존재하는 패키지를 자동으로 basePackage로 설정한다.
 * 문자열 배열 형태로 여러 beanPackage를 등록할 수 있다.*/

/*루트를 읽고 컴포넌트 가져와?!!? @Component 달아놨으니까 읽어와라...라는 의미(MemberDAOImpl.java파일)*/
@ComponentScan(basePackages = "com.greedy.section01.javaconfig")
public class ContextConfiguration {
	
}
