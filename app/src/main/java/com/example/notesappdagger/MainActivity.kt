package com.example.notesappdagger

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notesappdagger.ui.theme.NotesAppDaggerTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var viewModel: NotesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as NotesApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val notes = viewModel.loadNotes()
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