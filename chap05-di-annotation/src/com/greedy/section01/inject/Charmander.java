package com.greedy.section01.inject;

import org.springframework.stereotype.Component;

@Component
public class Charmander implements Pokemon {

	
	/**/
	@Override
	public void attack() {
		System.out.println("파이리가 불을 발사한다~~~...");
	}

	
	
	
}
