package it.camerassr.camerapreview.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import it.camerassr.camerapreview.ui.CameraPreview
import it.camerassr.camerapreview.ui.FirstScreen


@Composable
fun NavHostCustom() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreenDestinations.FirstScreen
    ) {
        composable<ScreenDestinations.FirstScreen> {
            FirstScreen(navController)
        }
        composable<ScreenDestinations.PreviewScreen> {
            CameraPreview(navController)
        }

    }
}