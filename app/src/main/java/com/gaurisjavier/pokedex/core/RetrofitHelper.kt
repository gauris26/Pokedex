package com.gaurisjavier.pokedex.core

import com.gaurisjavier.pokedex.domain.contracts.RetrofitEndpoint
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private const val baseUrl = "https://pokeapi.co/api/v2/"
    fun getRetrofitInstance(): RetrofitEndpoint {
        val builder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
        return builder.build().create(RetrofitEndpoint::class.java)
    }
}