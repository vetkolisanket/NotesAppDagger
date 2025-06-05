package com.example.notesappdagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesRepository @Inject constructor(private val logger: Logger) {
    fun getNotes(): List<String> {
        logger.log("Fetching notes")
        return listOf("Note 1", "Note 2")
    }
}