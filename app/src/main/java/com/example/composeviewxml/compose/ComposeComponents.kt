package com.example.composeviewxml.compose


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SampleButton(onCLick: () -> Unit) {

    Button(
        onClick = { onCLick() },
        modifier = Modifier.fillMaxWidth(),
        enabled = true
    ) {
        Text(text = "COMPOSE BUTTON")
    }

}

@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun SampleButtonPreview() {
    ComposeSampleTheme {
        SampleButton(onCLick = {})
    }
}