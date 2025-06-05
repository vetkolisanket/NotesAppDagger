package com.example.notesappdagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {
    fun inject(activity: MainActivity)
}