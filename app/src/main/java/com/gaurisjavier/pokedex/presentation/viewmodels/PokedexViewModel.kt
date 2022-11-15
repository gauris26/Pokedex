package com.gaurisjavier.pokedex.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gaurisjavier.pokedex.domain.entities.Pokemon
import com.gaurisjavier.pokedex.usecases.GetPokemonByNameUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokedexViewModel(private val useCase: GetPokemonByNameUseCase) : ViewModel() {
    private val _searchedPokemon = MutableLiveData<Pokemon>()
    val searchedPokemon : LiveData<Pokemon> = _searchedPokemon

    fun getPokemonByName(name : String){
        viewModelScope.launch(Dispatchers.IO) {
            _searchedPokemon.postValue(useCase.invoke(name))
        }
    }
}

class GetPokemonByName {

}
