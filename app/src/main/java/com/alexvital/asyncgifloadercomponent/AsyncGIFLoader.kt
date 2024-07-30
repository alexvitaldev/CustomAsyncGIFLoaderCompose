package com.alexvital.asyncgifloadercomponent

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.decode.GifDecoder
import coil.request.ImageRequest
import coil.request.repeatCount

/**
 * A composable function to load and display a GIF from a URL using Coil.
 *
 * @param url The URL of the GIF to be loaded.
 * @param width The width of the GIF. Default is 100.dp.
 * @param height The height of the GIF. Default is 100.dp.
 * @param contentDescription A description of the GIF for accessibility.
 */
@Composable
fun AsyncGIFLoader(
    url: String,
    width: Dp = 100.dp,
    height: Dp = 100.dp,
    contentDescription: String = "GIF"
) {
    val imageRequest = ImageRequest.Builder(LocalContext.current)
        .data(url)
        .decoderFactory(GifDecoder.Factory())
        .crossfade(true)
        .repeatCount(0)
        .build()

    AsyncImage(
        modifier = Modifier
            .width(width)
            .height(height),
        model = imageRequest,
        contentDescription = contentDescription
    )
}
