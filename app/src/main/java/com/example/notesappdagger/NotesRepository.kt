package com.example.notesappdagger

interface NotesRepository {
    fun getNotes(): List<String>
}