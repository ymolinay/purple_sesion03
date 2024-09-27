package com.purple.myapps03.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import com.purple.myapps03.viewmodel.CounterViewModelStateFlowSavedStateHandle

@Composable
fun CounterScreenStateFlowSavedStateHandle(viewModel: CounterViewModelStateFlowSavedStateHandle = viewModel()) {
    val counterValue = viewModel.counter.collectAsState().value

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "StateFlow + SavedStateHandle Counter: $counterValue")
        Button(onClick = { viewModel.incrementCounter() }) {
            Text("Sumar StateFlow + SavedStateHandle")
        }
    }
}