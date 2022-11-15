package com.gaurisjavier.pokedex.data.dao

import com.google.gson.annotations.SerializedName

data class PokemonDao (
    @SerializedName("id") var id : Int? = null,
    @SerializedName("name") var name : String? = null,
)