package com.example.mytestapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun BaseScreen(viewModel: ChanceViewModel) {
    ChanceScreen(onClickListener = { viewModel.generateDigit() },
        number= viewModel.chanceDigit.value.toString()
    )

}


@Composable
fun ChanceScreen(
    onClickListener: () -> Unit,
    number: String,
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = { onClickListener.invoke()}
        ) {
            Text(text = number)
        }

    }

}