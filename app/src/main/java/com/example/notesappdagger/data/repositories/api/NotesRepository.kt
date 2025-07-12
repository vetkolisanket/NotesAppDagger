package com.example.notesappdagger.data.repositories.api

import com.example.notesappdagger.models.Note

interface NotesRepository {
    fun getNotes(): List<Note>
}