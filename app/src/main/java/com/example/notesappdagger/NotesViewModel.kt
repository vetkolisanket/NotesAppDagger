package com.example.notesappdagger

import javax.inject.Inject

class NotesViewModel @Inject constructor(private val repository: NotesRepository) {
    fun loadNotes() = repository.getNotes()
}