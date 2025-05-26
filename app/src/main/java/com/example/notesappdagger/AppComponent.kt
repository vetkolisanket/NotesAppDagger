package com.example.notesappdagger

import dagger.Component

@Component
interface AppComponent {
    fun getNotesViewModel(): NotesViewModel
}