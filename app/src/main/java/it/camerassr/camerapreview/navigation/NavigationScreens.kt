package it.camerassr.camerapreview.navigation

import kotlinx.serialization.Serializable


open class ScreenDestinations{
    @Serializable
    object PreviewScreen : ScreenDestinations()

    @Serializable
    object FirstScreen: ScreenDestinations()


}
