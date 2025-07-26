package com.example.notesappdagger.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.example.notesappdagger.commons.MyNavigationApp
import com.example.notesappdagger.commons.NotesApp
import com.example.notesappdagger.ui.theme.NotesAppDaggerTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as NotesApp).appComponent.activityComponent().create().inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotesAppDaggerTheme {
                val navController = rememberNavController()
                MyNavigationApp(viewModelFactory, navController, ::onBackClick)
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