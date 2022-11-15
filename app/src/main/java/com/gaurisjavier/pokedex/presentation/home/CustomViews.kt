package com.gaurisjavier.pokedex.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.gaurisjavier.pokedex.R

@Preview(showBackground = true, widthDp = 400, heightDp = 360)
@Composable
fun PokemonCharacterViewPreview() {
    PokemonCharacterView(name = "Abra", number = 26, imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/150.png")
}

@Composable
fun PokemonCharacterView(number: Int, name: String, imageUrl : String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = imageUrl,
            contentDescription = null
        )
        //Image(painter = painterResource(id = R.drawable.pokemon_placeholder), contentDescription = null)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "No. $number",
                style = TextStyle(
                    fontSize = 22.sp,
                    color = Color.LightGray
                )
            )
            Text(
                name,
                style = TextStyle(
                    fontSize = 28.sp,
                )
            )
        }
    }
}
