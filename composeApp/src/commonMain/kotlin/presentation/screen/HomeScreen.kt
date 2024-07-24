package presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import data.remote.api.CurrencyApiServiceImpl
import presentation.components.HomeHeader
import surfaceColor

class HomeScreen: Screen {

    @Composable
    override fun Content(){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(surfaceColor)
        ) {
            HomeHeader(
                status = ,
                onRatesRefresh = {

                }
            )
        }
    }
}