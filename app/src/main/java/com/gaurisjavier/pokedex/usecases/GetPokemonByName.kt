package com.gaurisjavier.pokedex.usecases

import com.gaurisjavier.pokedex.domain.contracts.PokemonRepository
import com.gaurisjavier.pokedex.domain.entities.Pokemon

class GetPokemonByNameUseCase (private val repository: PokemonRepository) {
    suspend fun invoke (name : String) : Pokemon{
        return repository.getPokemonByName(name)
    }
}