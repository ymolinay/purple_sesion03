package com.purple.myapps03.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModelStateFlow : ViewModel() {
    private val _counter = MutableStateFlow(0)
    val counter: StateFlow<Int> get() = _counter

    fun incrementCounter() {
        _counter.value += 1
    }
}