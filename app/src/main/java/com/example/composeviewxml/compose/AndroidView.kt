package com.example.composeviewxml.compose

import android.widget.Button
import android.widget.TextView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun PanelCompose() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column(
            modifier = Modifier.wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {

            AndroidView(
                modifier = Modifier.wrapContentSize(),
                factory = { context ->
                    Button(context).apply {
                        text = "VIEW BUTTON"
                    }
                }
            )
            AndroidView(
                modifier = Modifier.wrapContentSize(),
                factory = { context ->
                    TextView(context).apply {
                        text = "VIEW TEXT"
                    }
                }
            )
            Column() {

            }
        }
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun PreviewPanelCompose() {
    PanelCompose()
}