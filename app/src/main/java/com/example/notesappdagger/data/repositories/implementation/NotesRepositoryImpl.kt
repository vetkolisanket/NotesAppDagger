package com.example.notesappdagger.data.repositories.implementation

import com.example.notesappdagger.data.local.Note
import com.example.notesappdagger.data.local.dao.NoteDao
import com.example.notesappdagger.data.repositories.api.NotesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
): NotesRepository {
    override fun getAllNotes(): Flow<List<Note>> {
        return noteDao.getAllNotes()
    }

}