package com.example.mytestapplication

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ChanceViewModel : ViewModel() {

    var chanceDigit = mutableStateOf(1)

    fun generateDigit() {
        chanceDigit.value++
    }


}