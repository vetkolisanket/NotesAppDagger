package com.example.notesappdagger

import javax.inject.Inject

@ActivityScope
class NoteEditorHelper @Inject constructor(
    private val logger: Logger
) {

    fun logEdit(note: String) {
        logger.log("Edited note: $note")
    }

}