package com.dicoding.rasagram.ui.pages

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State

class ScanImageViewModel : ViewModel() {
    private var _clickCount = mutableStateOf(0)
    val clickCount: State<Int> get() = _clickCount

    fun incrementClickCount() {
        _clickCount.value = _clickCount.value + 1
    }

    fun resetClickCount() {
        _clickCount.value = 0
    }
}
