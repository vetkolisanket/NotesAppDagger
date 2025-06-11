package com.example.notesappdagger

import javax.inject.Inject

class FirebaseAnalyticsService @Inject constructor() : AnalyticsService {
    override fun logEvent(event: String) {
        println("Logging to Firebase: $event")
    }

}