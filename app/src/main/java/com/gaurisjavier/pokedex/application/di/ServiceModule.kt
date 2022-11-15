package com.gaurisjavier.pokedex.application.di

import com.gaurisjavier.pokedex.core.RetrofitHelper
import com.gaurisjavier.pokedex.data.respository.PokemonRepositoryImpl
import com.gaurisjavier.pokedex.domain.contracts.PokemonRepository
import com.gaurisjavier.pokedex.usecases.GetPokemonByNameUseCase
import org.koin.dsl.module

val serviceModule = module {
    single { GetPokemonByNameUseCase(get()) }
    single <PokemonRepository> { PokemonRepositoryImpl(get()) }
    single { RetrofitHelper.getRetrofitInstance() }
}