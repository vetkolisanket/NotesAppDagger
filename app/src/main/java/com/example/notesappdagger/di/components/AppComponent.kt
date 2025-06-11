package com.example.notesappdagger.di.components

import com.example.notesappdagger.di.modules.AnalyticsModule
import com.example.notesappdagger.di.modules.AppModule
import com.example.notesappdagger.di.modules.RepositoryModule
import com.example.notesappdagger.di.modules.ViewModelModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    RepositoryModule::class,
    ViewModelModule::class,
    AnalyticsModule::class
])
interface AppComponent {
    fun activityComponent(): ActivityComponent.Factory
}