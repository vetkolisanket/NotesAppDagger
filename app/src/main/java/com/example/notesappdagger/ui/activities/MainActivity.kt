package com.example.notesappdagger.ui.activities

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.example.notesappdagger.commons.MyNavigationApp
import com.example.notesappdagger.commons.NoteEditorHelper
import com.example.notesappdagger.commons.NotesApp
import com.example.notesappdagger.ui.theme.NotesAppDaggerTheme
import com.example.notesappdagger.viewmodels.NotesViewModel
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: NotesViewModel by viewModels { viewModelFactory }

    @Inject
    lateinit var prefs: SharedPreferences

    @Inject
    lateinit var noteEditorHelper: NoteEditorHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as NotesApp).appComponent.activityComponent().create().inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val notes = viewModel.loadNotes()
        noteEditorHelper.logEdit("Test Note")
        setContent {
            NotesAppDaggerTheme {
                val navController = rememberNavController()
                MyNavigationApp(notes, navController, ::onBackClick)
            }
        }
    }

    private fun onBackClick() {
        finish()
    }
}

@Preview(showBackground = true)
@Composable
fun NotesAppPreview() {
    NotesAppDaggerTheme {
    }
}