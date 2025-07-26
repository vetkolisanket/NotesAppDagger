package com.example.notesappdagger.ui.composables

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
inline fun <reified VM: ViewModel> daggerViewModel(
    viewModelStoreOwner: ViewModelStoreOwner = LocalViewModelStoreOwner.current!!,
    factory: ViewModelProvider.Factory
): VM {
    return viewModel(viewModelStoreOwner = viewModelStoreOwner, factory = factory)
}