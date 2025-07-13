package com.example.notesappdagger.commons

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notesappdagger.models.Note
import com.example.notesappdagger.ui.composables.CreateOrEditNote
import com.example.notesappdagger.ui.composables.NotesScreen

@Composable
fun MyNavigationApp(
    notes: List<Note>,
    navController: NavHostController,
    onBackClick: () -> Unit,
) {
    NavHost(navController = navController, startDestination = Screen.Notes.route) {
        composable(Screen.Notes.route) {
            NotesScreen(notes, navController, onBackClick)
        }
        composable(Screen.CreateOrEditNote.route) {
            CreateOrEditNote(navController)
        }
    }
}