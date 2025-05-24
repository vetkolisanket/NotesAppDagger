package com.example.notesappdagger

class NotesRepository(private val logger: Logger) {
    fun getNotes(): List<String> {
        logger.log("Fetching notes")
        return listOf("Note 1", "Note 2")
    }
}