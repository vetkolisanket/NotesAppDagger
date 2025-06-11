package com.example.notesappdagger.data.implementation

import com.example.notesappdagger.data.api.Logger
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AndroidLogger @Inject constructor(): Logger {
    override fun log(msg: String) = println("LOG: $msg")
}