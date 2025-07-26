package com.example.notesappdagger.di.modules

import com.example.notesappdagger.data.local.dao.NoteDao
import com.example.notesappdagger.data.repositories.api.NotesRepository
import com.example.notesappdagger.data.repositories.implementation.NotesRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNotesRepository(noteDao: NoteDao): NotesRepository {
        return NotesRepositoryImpl(noteDao)
    }

}