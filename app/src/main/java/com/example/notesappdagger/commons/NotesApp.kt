package com.example.notesappdagger.commons

import android.app.Application
import com.example.notesappdagger.di.components.AppComponent
import com.example.notesappdagger.di.components.DaggerAppComponent
import com.example.notesappdagger.di.modules.AppModule

class NotesApp : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

    }

}