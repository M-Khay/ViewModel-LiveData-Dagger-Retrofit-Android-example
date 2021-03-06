package com.example.viewmodellivedatadaggerretrofit.api

import com.example.viewmodellivedatadaggerretrofit.model.SpeciesList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by Boonya Kitpitak on 6/16/17.
 */
interface Swapi {
    @GET("species/")
    fun getSpecies(): Call<SpeciesList>
}
