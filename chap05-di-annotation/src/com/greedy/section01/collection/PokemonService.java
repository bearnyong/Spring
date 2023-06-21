package com.greedy.section01.collection;

import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
	
//	private Map<String, Pokemon> pokemon;
	private Pokemon[] pokemon2;

	@Autowired
	public PokemonService(Pokemon[] pokemon) {
		this.pokemon2 = pokemon;
	}
	
//	@Autowired
//	public PokemonService(Map<String, Pokemon> pokemon) {
//		this.pokemon = pokemon;
//	}
	
	public void pokemonAttack() {
//		Iterator<String> iter = pokemon.keySet().iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			System.out.println("pokemonMap의 key : " + key);
//			pokemon.get(key).attack();
//		}
		
		for (Pokemon pokemon : pokemon2) {
			pokemon.attack();
		}
		
	}
}
