package com.example.notesappdagger.di.modules

import com.example.notesappdagger.data.api.AnalyticsService
import com.example.notesappdagger.data.implementation.FirebaseAnalyticsService
import com.example.notesappdagger.data.implementation.MixpanelAnalyticsService
import com.example.notesappdagger.di.annotations.FirebaseAnalytics
import com.example.notesappdagger.di.annotations.MixpanelAnalytics
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