package com.example.notesappdagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesRepositoryImpl @Inject constructor(private val logger: Logger): NotesRepository {
    override fun getNotes(): List<String> {
        logger.log("Fetching notes")
        return listOf("Note 1", "Note 2")
    }
}