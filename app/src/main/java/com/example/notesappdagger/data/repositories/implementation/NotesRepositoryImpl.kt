package com.example.notesappdagger.data.repositories.implementation

import com.example.notesappdagger.data.repositories.api.NotesRepository
import com.example.notesappdagger.models.Note
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesRepositoryImpl @Inject constructor(): NotesRepository {
    override fun getNotes(): List<Note> {
        return listOf(Note("Title 1", "Description 1"), Note("Title 2", "Description 2"))
    }
}