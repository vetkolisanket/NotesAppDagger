package com.example.notesappdagger

import javax.inject.Inject

class NotesRepository @Inject constructor(private val logger: Logger) {
    fun getNotes(): List<String> {
        logger.log("Fetching notes")
        return listOf("Note 1", "Note 2")
    }
}