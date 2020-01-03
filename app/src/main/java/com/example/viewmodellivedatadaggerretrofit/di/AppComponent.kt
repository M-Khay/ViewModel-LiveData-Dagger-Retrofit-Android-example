package com.example.viewmodellivedatadaggerretrofit.di

import com.example.viewmodellivedatadaggerretrofit.species.SpeciesListViewModel
import dagger.Component
import javax.inject.Singleton

/**
 */

@Singleton
@Component(
        modules = arrayOf(
                ApiModule::class,
                SpeciesRepositoryModule::class
        )
)
interface AppComponent {

    fun inject(speciesListViewModel: SpeciesListViewModel)

}