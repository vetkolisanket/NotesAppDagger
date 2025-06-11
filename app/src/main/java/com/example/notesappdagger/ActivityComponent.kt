package com.example.notesappdagger

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