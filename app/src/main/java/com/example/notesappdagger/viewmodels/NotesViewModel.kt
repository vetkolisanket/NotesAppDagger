package com.example.notesappdagger.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notesappdagger.data.local.Note
import com.example.notesappdagger.data.repositories.api.NotesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotesViewModel @Inject constructor(
    private val repository: NotesRepository,
): ViewModel() {

    sealed class NotesUiState {
        data object Loading: NotesUiState()
        data class Success(val notes: List<Note>): NotesUiState()
        data class Error(val message: String): NotesUiState()
    }

    private val _uiState = MutableStateFlow<NotesUiState>(NotesUiState.Loading)
    val uiState: StateFlow<NotesUiState> = _uiState.asStateFlow()

    init {
        loadNotes()
    }

    fun loadNotes() {
        viewModelScope.launch {
        _uiState.value = NotesUiState.Loading

        repository.getAllNotes()
            .catch { exception ->
                _uiState.value = NotesUiState.Error(
                    exception.message ?: "An unknown error occured"
                )
            }
            .collect{ notesList ->
                _uiState.value = NotesUiState.Success(notesList)
            }
        }
    }
}