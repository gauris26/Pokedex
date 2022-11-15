package com.gaurisjavier.pokedex.data.respository

import com.gaurisjavier.pokedex.domain.contracts.PokemonRepository
import com.gaurisjavier.pokedex.domain.contracts.RetrofitEndpoint
import com.gaurisjavier.pokedex.domain.entities.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonRepositoryImpl (private val retrofit: RetrofitEndpoint) : PokemonRepository {
    override suspend fun getPokemonByName(name: String) : Pokemon {
        val response = retrofit.getPokemenByName(name)
        val pokemonDao = response.body()

        return pokemonDao?.let {
            Pokemon(name = it.name ?: "")
        } ?: Pokemon.empty()
    }
}