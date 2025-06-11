package com.example.notesappdagger

import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesViewModel @Inject constructor(
    private val repository: NotesRepository,
    @FirebaseAnalytics private val firebaseAnalyticsService: AnalyticsService,
    @MixpanelAnalytics private val mixpanelAnalyticsService: AnalyticsService
): ViewModel() {
    fun loadNotes(): List<String> {
        firebaseAnalyticsService.logEvent("Loading notes")
        mixpanelAnalyticsService.logEvent("Loading notes")
        return repository.getNotes()
    }
}