# CustomAsyncGIFLoaderCompose

A custom Jetpack Compose component to load and display GIFs using Coil.

## Features

- Load and display GIFs from URLs.
- Customize the width and height of the GIF.
- Set a content description for accessibility.

## Requirements

Add the following dependencies to your `build.gradle` file:

```groovy
dependencies {
    // Coil
    implementation("io.coil-kt:coil-compose:2.6.0")
    implementation("io.coil-kt:coil-gif:2.6.0")
    implementation("com.google.accompanist:accompanist-drawablepainter:0.32.0")
}
```


## Usage

To use the `AsyncGIFLoader` component, simply call it with the required URL and optional parameters for width, height, and content description.

### Example

```kotlin
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.ui.components.AsyncGIFLoader

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
```
