package com.greedy.section01.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/* POJO(Plain Old Java Object)란? 오래된 방식의 간단한 자바 오프젝트*/
		/* 스프링 전용인 @Autowired 대신 자바 표준 어노테이션 @Resource로 Pojo 연결
		 * 
		 * 스프링이 @Autowired를 처음 선보이고 얼마 지나지 않아 자바 진영에서도 동일한 기능의 어노테이션을 여러 개 표준화 했다.
		 * @Resource와 @Inject, @named가 그러하다.*/
		
		//@Resource 어노테이션을 사용하는 방법
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.resource");
		
		/*PokemonService class 생성*/
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
				
	}

}
