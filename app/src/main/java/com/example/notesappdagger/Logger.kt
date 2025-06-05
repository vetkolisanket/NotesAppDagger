package com.example.notesappdagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Logger @Inject constructor() {
    fun log(msg: String) = println("LOG: $msg")
}