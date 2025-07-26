package com.example.notesappdagger.viewmodels

import androidx.lifecycle.ViewModel
import com.example.notesappdagger.data.repositories.api.NotesRepository
import com.example.notesappdagger.models.Note
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesViewModel @Inject constructor(
    private val repository: NotesRepository,
): ViewModel() {
    fun loadNotes(): List<Note> {
        return repository.getNotes()
    }
}