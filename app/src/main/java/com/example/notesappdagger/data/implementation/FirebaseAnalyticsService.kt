package com.example.notesappdagger.data.implementation

import com.example.notesappdagger.data.api.AnalyticsService
import javax.inject.Inject

class FirebaseAnalyticsService @Inject constructor() : AnalyticsService {
    override fun logEvent(event: String) {
        println("Logging to Firebase: $event")
    }

}