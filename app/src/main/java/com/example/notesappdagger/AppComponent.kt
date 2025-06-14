package com.example.notesappdagger

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