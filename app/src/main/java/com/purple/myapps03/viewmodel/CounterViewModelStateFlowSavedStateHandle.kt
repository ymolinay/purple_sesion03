package com.purple.myapps03.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModelStateFlowSavedStateHandle(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    companion object {
        private const val COUNTER_KEY = "counter"
    }

    private val _counter = MutableStateFlow(savedStateHandle.get<Int>(COUNTER_KEY) ?: 0)
    val counter: StateFlow<Int> get() = _counter

    fun incrementCounter() {
        _counter.value += 1
        savedStateHandle[COUNTER_KEY] = _counter.value // Guardar en SavedStateHandle
    }
}