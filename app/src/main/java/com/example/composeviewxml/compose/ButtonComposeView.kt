package com.example.composeviewxml.compose

import android.content.Context
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.AbstractComposeView

class ButtonComposeView(context: Context) : AbstractComposeView(context) {

    var text = mutableStateOf("")

    @Composable
    override fun Content() {
        MaterialTheme {
            SampleButton(
                text = text.value,
                onCLick = { }
            )
        }
    }
}