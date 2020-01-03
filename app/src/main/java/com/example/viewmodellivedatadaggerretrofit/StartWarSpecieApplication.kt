package com.example.viewmodellivedatadaggerretrofit

import android.app.Application
import com.example.viewmodellivedatadaggerretrofit.di.ComponentInjector

class StartWarSpecieApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        ComponentInjector.init()
    }
}