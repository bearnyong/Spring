package com.greedy.section01.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
	
	private Pokemon pokemon;

	@Autowired /*@Qualifier와 @Primary 중에 어떤 것이 더 우선 순위가 되는가? @Qualifier*/
	public PokemonService(@Qualifier("charmander")Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() { 
		pokemon.attack();
	}
}
