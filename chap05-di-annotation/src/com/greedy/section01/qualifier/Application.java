package com.greedy.section01.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/*동일한 타입의 여러개의 빈이 존재하는 경우 @Qualifier("BeanName")을 이용하여 의존성을 주입한다.*/
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.qualifier");
		
		/*PokemonService class 생성*/
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		
		pokemonService.pokemonAttack();
				
	}

}
