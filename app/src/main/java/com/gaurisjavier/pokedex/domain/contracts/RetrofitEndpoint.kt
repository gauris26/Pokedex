package com.gaurisjavier.pokedex.domain.contracts

import com.gaurisjavier.pokedex.data.dao.PokemonDao
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitEndpoint {
    @GET("pokemon/{name}")
    suspend fun getPokemonByName(@Path("name") name: String) : Response<PokemonDao>
}