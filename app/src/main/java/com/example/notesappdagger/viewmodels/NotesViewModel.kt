package com.example.notesappdagger.viewmodels

import androidx.lifecycle.ViewModel
import com.example.notesappdagger.data.api.AnalyticsService
import com.example.notesappdagger.data.repositories.api.NotesRepository
import com.example.notesappdagger.di.annotations.FirebaseAnalytics
import com.example.notesappdagger.di.annotations.MixpanelAnalytics
import com.example.notesappdagger.models.Note
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesViewModel @Inject constructor(
    private val repository: NotesRepository,
    @FirebaseAnalytics private val firebaseAnalyticsService: AnalyticsService,
    @MixpanelAnalytics private val mixpanelAnalyticsService: AnalyticsService
): ViewModel() {
    fun loadNotes(): List<Note> {
        firebaseAnalyticsService.logEvent("Loading notes")
        mixpanelAnalyticsService.logEvent("Loading notes")
        return repository.getNotes()
    }
}