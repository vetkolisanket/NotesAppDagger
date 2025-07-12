package com.example.notesappdagger

import dagger.Module
import dagger.Provides

@Module
object AnalyticsModule {

    @Provides
    @FirebaseAnalytics
    fun provideFirebaseAnalytics(): AnalyticsService = FirebaseAnalyticsService()

    @Provides
    @MixpanelAnalytics
    fun provideMixpanelAnalytics(): AnalyticsService = MixpanelAnalyticsService()

}