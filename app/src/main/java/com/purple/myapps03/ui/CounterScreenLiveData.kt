package com.purple.myapps03.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import com.purple.myapps03.viewmodel.CounterViewModelLiveData

@Composable
fun CounterScreenLiveData(viewModel: CounterViewModelLiveData = viewModel()) {
    val counterValue by viewModel.counter.observeAsState(0)

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "LiveData Counter: $counterValue")
        Button(onClick = { viewModel.incrementCounter() }) {
            Text("Sumar LiveData")
        }
    }
}