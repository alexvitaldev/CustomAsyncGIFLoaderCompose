package com.alexvital.asyncgifloadercomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleScreen()
        }
    }
}

@Composable
fun ExampleScreen() {
    Column {
        AsyncGIFLoader(
            url = "https://example.com/sample.gif",
            width = 150.dp,
            height = 150.dp,
            contentDescription = "Sample GIF"
        )
    }
}