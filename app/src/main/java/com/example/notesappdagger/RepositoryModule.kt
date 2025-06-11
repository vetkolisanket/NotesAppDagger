package com.example.notesappdagger

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