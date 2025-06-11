package com.example.notesappdagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AndroidLogger @Inject constructor(): Logger {
    override fun log(msg: String) = println("LOG: $msg")
}