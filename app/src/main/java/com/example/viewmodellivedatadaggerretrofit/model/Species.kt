package com.example.viewmodellivedatadaggerretrofit.model

import com.google.gson.annotations.SerializedName

/**
 * Created by im_khay
 */
data class Species(val name : String, val classification : String, val language : String, @SerializedName("average_lifespan") val lifeSpan : String)