package com.example.notesappdagger.data.repositories.api

interface NotesRepository {
    fun getNotes(): List<String>
}