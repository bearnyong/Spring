package com.greedy.section01.resource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pikachu implements Pokemon {

	@Override
	public void attack() {
		System.out.println("피카츄 전기~~~....");
	}
	
	
	
}
