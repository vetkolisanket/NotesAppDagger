package com.example.notesappdagger.di.modules

import com.example.notesappdagger.data.api.Logger
import com.example.notesappdagger.data.implementation.AndroidLogger
import com.example.notesappdagger.data.repositories.api.NotesRepository
import com.example.notesappdagger.data.repositories.implementation.NotesRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindsNotesRepository(impl: NotesRepositoryImpl): NotesRepository

    @Binds
    @Singleton
    abstract fun bindLogger(logger: AndroidLogger): Logger

}