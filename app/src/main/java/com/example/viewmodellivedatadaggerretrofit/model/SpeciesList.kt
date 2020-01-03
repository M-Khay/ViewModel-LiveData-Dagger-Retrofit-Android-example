package com.example.viewmodellivedatadaggerretrofit.model

import com.google.gson.annotations.SerializedName

/**
 * Created by i_m_khay
 */
data class SpeciesList(@SerializedName("results") val speciesList: List<Species>, val next: String?)