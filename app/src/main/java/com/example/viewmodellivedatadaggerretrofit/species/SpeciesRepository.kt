package com.example.viewmodellivedatadaggerretrofit.species

import com.example.viewmodellivedatadaggerretrofit.model.Species


interface SpeciesRepository {

    fun getSpecies(successHandler: (List<Species>?) -> Unit, failureHandler: (Throwable?) -> Unit)

}
