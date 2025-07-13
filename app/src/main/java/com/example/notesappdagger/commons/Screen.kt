package com.example.notesappdagger.commons

sealed class Screen(val route: String) {
    data object Notes: Screen("notes")
    data object CreateOrEditNote: Screen("createOrEditNote")
}