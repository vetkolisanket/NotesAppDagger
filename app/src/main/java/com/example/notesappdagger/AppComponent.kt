package com.example.notesappdagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, RepositoryModule::class, ViewModelModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}