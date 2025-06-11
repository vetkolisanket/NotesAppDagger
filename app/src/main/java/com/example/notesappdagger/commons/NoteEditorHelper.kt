package com.example.notesappdagger.commons

import com.example.notesappdagger.data.api.Logger
import com.example.notesappdagger.di.scopes.ActivityScope
import javax.inject.Inject

@ActivityScope
class NoteEditorHelper @Inject constructor(
    private val logger: Logger
) {

    fun logEdit(note: String) {
        logger.log("Edited note: $note")
    }

}