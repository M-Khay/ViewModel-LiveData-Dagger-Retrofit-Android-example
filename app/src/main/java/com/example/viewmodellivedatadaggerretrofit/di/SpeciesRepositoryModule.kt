package com.example.viewmodellivedatadaggerretrofit.di

import com.example.viewmodellivedatadaggerretrofit.api.Swapi
import com.example.viewmodellivedatadaggerretrofit.species.SpeciesRepository
import com.example.viewmodellivedatadaggerretrofit.species.SpeciesRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by oozou on 7/20/2017 AD.
 */

@Module
class SpeciesRepositoryModule {

    @Provides @Singleton
    fun providePostRepository(apiService: Swapi): SpeciesRepository = SpeciesRepositoryImpl(apiService)
}