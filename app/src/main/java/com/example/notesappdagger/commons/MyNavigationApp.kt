package com.example.notesappdagger.commons

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notesappdagger.ui.composables.CreateOrEditNote
import com.example.notesappdagger.ui.composables.NotesScreen

@Composable
fun MyNavigationApp(
    viewModelFactory: ViewModelProvider.Factory,
    navController: NavHostController,
    onBackClick: () -> Unit,
) {
    NavHost(navController = navController, startDestination = Screen.Notes.route) {
        composable(Screen.Notes.route) {
            NotesScreen(viewModelFactory, navController, onBackClick)
        }
        composable(Screen.CreateOrEditNote.route) {
            CreateOrEditNote(navController)
        }
    }
}