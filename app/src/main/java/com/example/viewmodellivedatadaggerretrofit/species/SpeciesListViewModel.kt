package com.example.viewmodellivedatadaggerretrofit.species

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewmodellivedatadaggerretrofit.model.Species
import javax.inject.Inject


class SpeciesListViewModel : ViewModel() {

    @Inject
    lateinit var repository : SpeciesRepository

    var isLoading = MutableLiveData<Boolean>()

    var apiError = MutableLiveData<Throwable>()

    var speciesResponse = MutableLiveData<List<Species>>()

    fun getSpecies() {
        isLoading.value = true
        repository.getSpecies(
            {
                speciesResponse.value = it
                isLoading.value = false
            },

            {
                apiError.value = it
                isLoading.value = false
            })
    }


    /**
     * Adapter Callback
     */

    fun getSpeciesAt(position: Int): Species? {
        if (position < getSpeciesSize()) {
            return speciesResponse.value?.get(position)
        } else {
            return null
        }
    }

    fun getSpeciesSize(): Int {
        speciesResponse.value?.let {
            return it.size
        }
        return 0
    }


}
