package com.example.notesappdagger.ui.activities

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
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
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        notes.forEach { note ->
                            Text(
                                text = note
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NotesAppDaggerTheme {
    }
}