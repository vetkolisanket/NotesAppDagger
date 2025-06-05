package com.example.notesappdagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesViewModel @Inject constructor(private val repository: NotesRepository) {
    fun loadNotes() = repository.getNotes()
}