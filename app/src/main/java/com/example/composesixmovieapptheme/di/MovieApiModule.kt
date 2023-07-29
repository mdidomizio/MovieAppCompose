package com.example.composesixmovieapptheme.di

import com.example.composesixmovieapptheme.data.api.ApiConstants
import com.example.composesixmovieapptheme.data.api.MovieApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MovieApiModule {
    @Provides
    @Singleton
    fun provideApi(builder:Retrofit.Builder): MovieApi{
        return builder
            .build()
            .create(MovieApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit (): Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
    }

}