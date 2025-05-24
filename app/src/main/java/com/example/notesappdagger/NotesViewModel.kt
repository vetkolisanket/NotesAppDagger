package com.example.notesappdagger

class NotesViewModel(private val repository: NotesRepository) {
    fun loadNotes() = repository.getNotes()
}