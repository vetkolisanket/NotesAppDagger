package com.example.notesappdagger.data.repositories.api

import com.example.notesappdagger.data.local.Note
import kotlinx.coroutines.flow.Flow

interface NotesRepository {
    fun getAllNotes(): Flow<List<Note>>
}