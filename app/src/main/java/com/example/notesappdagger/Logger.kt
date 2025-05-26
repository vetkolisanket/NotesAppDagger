package com.example.notesappdagger

import javax.inject.Inject

class Logger @Inject constructor() {
    fun log(msg: String) = println("LOG: $msg")
}