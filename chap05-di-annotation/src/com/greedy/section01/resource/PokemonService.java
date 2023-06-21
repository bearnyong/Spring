package com.greedy.section01.resource;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
	
	/*pokemon type의 빈이 여러개인 경우 아래와 같이 명시를 해준다.*/
//	@Resource(name = "charmander")
//	private Pokemon pokemon;
	
//	@Autowired
//	public PokemonService(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
//	public void pokemonAttack() { 
//		pokemon.attack();
//	}
	
	
	/*동일 타입이 여러개인 bean을 사용하는 경우*/
//	@Resource
//	private List<Pokemon> pokemonList;
//
//	@Autowired
//	public PokemonService(List<Pokemon> pokemon) {
//		this.pokemonList = pokemon;
//	}
//	
//	public void pokemonAttack() { 
//		for (Pokemon pokemon : pokemonList) {
//			pokemon.attack();
//		}
//	}
	
	
	@Resource(name = "charmander")
	private Pokemon pokemon;

	/*@Resource 생성자 주입이 불가능하다.*/
	public PokemonService(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	// @Resource 세터 주입은 가능하다.
	public void setPokemon(Pokemon pokemon) { 
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() { 
		this.pokemon.attack();
	}

}
