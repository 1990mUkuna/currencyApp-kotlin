import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import di.initializeKoin
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.screen.HomeScreen


@Composable
@Preview
fun App() {
    /* val colors = if(!isSystemInDarkTheme()) LightColors else  DarkColors

    MaterialTheme(colorScheme = colors) {
    } */
    initializeKoin()
    MaterialTheme{
        // Home Screen will be the start destination
        Navigator(HomeScreen())
    }
}