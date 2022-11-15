package com.gaurisjavier.pokedex.application.di

import com.gaurisjavier.pokedex.presentation.viewmodels.PokedexViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { PokedexViewModel(get()) }
}