import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    val colors = if(!isSystemInDarkTheme()) LightColors else  DarkColors

    MaterialTheme(colorScheme = colors) {
    }
}