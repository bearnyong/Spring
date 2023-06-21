package com.greedy.section01.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/* 여러 개의 bean을 등록하고 사용하는 경우 체크해보기*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.collection");
		
		/*PokemonService class 생성*/
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
				
	}

}
