package com.gaurisjavier.pokedex.domain.entities

data class Pokemon (val name : String) {
    companion object {
        fun empty() = Pokemon("")
    }
}
