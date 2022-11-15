package com.gaurisjavier.pokedex

import android.app.Application
import com.gaurisjavier.pokedex.application.di.appModule
import com.gaurisjavier.pokedex.application.di.serviceModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PokedexApplication : Application (){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@PokedexApplication)
            modules(appModule, serviceModule)
        }
    }
}