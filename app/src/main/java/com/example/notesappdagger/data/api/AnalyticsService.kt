package com.example.notesappdagger.data.api

interface AnalyticsService {
    fun logEvent(event: String)
}