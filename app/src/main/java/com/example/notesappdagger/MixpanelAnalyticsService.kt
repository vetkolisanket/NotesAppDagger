package com.example.notesappdagger

import javax.inject.Inject

class MixpanelAnalyticsService @Inject constructor(): AnalyticsService {
    override fun logEvent(event: String) {
        println("Logging to Mixpanel: $event")
    }
}