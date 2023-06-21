package com.greedy.section01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/* 이번에는 한 개의 인터페이스를 상속받는 여러 클래스를 모두 Bean으로 등록한 경우 해결하는 방법을 본다.*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.primary");
		
		/*PokemonService class 생성*/
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
				
	}

}
