package com.example.composesixmovieapptheme.data.repository

import com.example.composesixmovieapptheme.data.api.MovieApi
import com.example.composesixmovieapptheme.data.api.model.Movie
import javax.inject.Inject

class MovieRepo @Inject constructor(
    private val movieApi: MovieApi
){
    suspend fun getMovie():List<Movie>{
        return movieApi.getMovie()
    }
}