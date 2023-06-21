package com.greedy.section01.inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import javax.inject.Named;

@Service
public class PokemonService {

	/* named를 이용한 의존성 주입 */
//	@Inject
//	@Named("charmander")
//	@Qualifier("charmander")
//	private Pokemon pokemon;
//	
//	
//	public PokemonService(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
//	
//	public void pokemonAttack() {
//		this.pokemon.attack();
//	}

	
	
//	private Pokemon pokemon;
//
//	/*생성자를 이용한 주입 방법*/
//	@Inject
//	@Named("charmander")
//	public PokemonService(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
//
//	public void pokemonAttack() {
//		this.pokemon.attack();
//	}
	
	
	
	private Pokemon pokemon;

	@Inject
	public PokemonService(@Named("charmander")Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public void pokemonAttack() {
		this.pokemon.attack();
	}

}
