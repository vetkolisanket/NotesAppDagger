package com.example.notesappdagger.di.modules

import android.content.Context
import com.example.notesappdagger.commons.NotesApp
import com.example.notesappdagger.data.local.NoteDatabase
import com.example.notesappdagger.data.local.dao.NoteDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val app: NotesApp) {

    @Provides
    @Singleton
    fun provideContext(): Context = app.applicationContext

    @Provides
    @Singleton
    fun provideNoteDatabase(appContext: Context): NoteDatabase {
        return NoteDatabase.getDatabase(appContext)
    }

    @Provides
    @Singleton
    fun provideNoteDao(database: NoteDatabase): NoteDao {
        return database.noteDao()
    }

}