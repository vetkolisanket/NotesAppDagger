package com.example.notesappdagger.di.components

import com.example.notesappdagger.di.scopes.ActivityScope
import com.example.notesappdagger.ui.activities.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface ActivityComponent {

    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): ActivityComponent
    }

}