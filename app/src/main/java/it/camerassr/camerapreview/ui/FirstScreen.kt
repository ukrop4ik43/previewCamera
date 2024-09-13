package it.camerassr.camerapreview.ui

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import it.camerassr.camerapreview.navigation.ScreenDestinations


@Composable
fun FirstScreen(navController: NavHostController) {
    Text("navigate", modifier = Modifier.clickable {
        navController.navigate(ScreenDestinations.PreviewScreen)
    })
}