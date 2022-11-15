package com.gaurisjavier.pokedex.presentation.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gaurisjavier.pokedex.domain.entities.Pokemon
import com.gaurisjavier.pokedex.presentation.ui.theme.PokedexTheme
import com.gaurisjavier.pokedex.presentation.viewmodels.PokedexViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PokedexHomeActivity : ComponentActivity() {
    private val pokedexViewModel : PokedexViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting2(){
                        pokedexViewModel.getPokemonByName(it)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting2(pokemon: Pokemon? = null, onSearch : (searchTerm : String) -> Unit) {
    var searchText by remember {
        mutableStateOf("")
    }

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Column {
            Column {
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = searchText,
                    onValueChange = {
                        searchText = it
                    },
                )
                OutlinedButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.End),
                    onClick = { onSearch.invoke(searchText) }) {
                    Text("Search Now!")
                }
            }

            if(pokemon != null) {
                PokemonCharacterView(name = pokemon.name, number = 0, imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/150.png")
            }
        }
    }

}

@Preview(showBackground = true, widthDp = 400, heightDp = 600)
@Composable
fun DefaultPreview2() {
    PokedexTheme {
        //Greeting2("Android")
    }
}