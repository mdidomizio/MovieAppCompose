package com.example.composesixmovieapptheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composesixmovieapptheme.navigation.MovieNavigation
import com.example.composesixmovieapptheme.ui.home.HomeScreen
import com.example.composesixmovieapptheme.ui.theme.ComposeSixMovieAppThemeTheme
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HomeScreen()

            /*MyApp {
                MovieNavigation()
            }*/
        }
    }
}
@Composable
fun MyApp(content: @Composable ()-> Unit){
    ComposeSixMovieAppThemeTheme {
        content()

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        MovieNavigation()
    }
}