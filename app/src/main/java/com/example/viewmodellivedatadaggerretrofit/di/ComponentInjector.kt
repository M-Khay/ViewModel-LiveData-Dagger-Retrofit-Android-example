package com.example.viewmodellivedatadaggerretrofit.di



class ComponentInjector {

    companion object {

        val BASE_URL = "https://swapi.co/api/"
        lateinit var component: AppComponent

        fun init() {
            component = DaggerAppComponent.builder()
                    .apiModule(ApiModule(BASE_URL))
                    .speciesRepositoryModule(SpeciesRepositoryModule())
                    .build()
        }
    }
}

