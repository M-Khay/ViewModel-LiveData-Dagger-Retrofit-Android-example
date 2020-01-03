package com.example.viewmodellivedatadaggerretrofit.species

import com.example.viewmodellivedatadaggerretrofit.model.Species
import com.example.viewmodellivedatadaggerretrofit.model.SpeciesList
import com.example.viewmodellivedatadaggerretrofit.api.Swapi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SpeciesRepositoryImpl (val apiService : Swapi) :
    SpeciesRepository {
    override fun getSpecies(
        successHandler: (List<Species>?) -> Unit,
        failureHandler: (Throwable?) -> Unit
    ) {
        apiService.getSpecies().enqueue(object : Callback<SpeciesList> {
            override fun onResponse(call: Call<SpeciesList>?, response: Response<SpeciesList>?) {
                response?.body()?.let {
                    successHandler(it.speciesList)
                }
            }

            override fun onFailure(call: Call<SpeciesList>?, t: Throwable?) {
                failureHandler(t)
            }
        })
    }
}