package com.example.notesappdagger.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notesappdagger.models.Note
import com.example.notesappdagger.ui.theme.NotesAppDaggerTheme

@Composable
fun NoteComposable(modifier: Modifier = Modifier, note: Note) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = note.title,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(bottom = 8.dp)
            )
            Text(
                text = note.description
            )
        }
    }
}

@Preview
@Composable
private fun NoteComposablePreview() {
    NotesAppDaggerTheme {
        NoteComposable(
            note = Note("Title", "Description")
        )
    }
}