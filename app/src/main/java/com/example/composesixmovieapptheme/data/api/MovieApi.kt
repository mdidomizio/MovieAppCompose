package com.example.composesixmovieapptheme.data.api

import com.example.composesixmovieapptheme.data.api.model.Movie
import retrofit2.http.GET

interface MovieApi {

    @GET(ApiConstants.END_POINTS)
    suspend fun getMovie():List<Movie>
}
