package com.gaurisjavier.pokedex.domain.contracts

import com.gaurisjavier.pokedex.domain.entities.Pokemon

interface PokemonRepository {
    suspend fun getPokemonByName(name: String) : Pokemon
}