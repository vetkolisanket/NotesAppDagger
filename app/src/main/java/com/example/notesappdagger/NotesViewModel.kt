package com.example.notesappdagger

import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesViewModel @Inject constructor(private val repository: NotesRepository): ViewModel() {
    fun loadNotes() = repository.getNotes()
}