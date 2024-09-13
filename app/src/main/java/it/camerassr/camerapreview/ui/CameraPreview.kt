package it.camerassr.camerapreview.ui

import android.content.Context
import android.util.Log
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun CameraPreview(navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        AndroidView(
            modifier = modifier,
            factory = { ctx ->
                PreviewView(ctx).apply {
                    this.scaleType = PreviewView.ScaleType.FILL_CENTER
                    this.implementationMode = PreviewView.ImplementationMode.COMPATIBLE
                }
            },
            update = { previewView ->
                startCamera(context, lifecycleOwner, previewView)
            }
        )
        Text(
            text =  "R.string.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnostic",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        Text(
            text =  "R.string.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnostic",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        Text(
            text =  "R.string.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnostic",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        Text(
            text =  "R.string.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnostic",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        Text(
            text =  "R.string.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnostic",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        Text(
            text =  "R.string.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnostic",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        Text(
            text =  "R.string.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnostic",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
        Text(
            text =  "R.string.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnosticstring.diagnostic",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )

    }

}

private fun startCamera(
    context: Context,
    lifecycleOwner: LifecycleOwner,
    previewView: PreviewView
) {
    val cameraProviderFuture = ProcessCameraProvider.getInstance(context)
    cameraProviderFuture.addListener({
        val cameraProvider = cameraProviderFuture.get()

        // Correct way to build a Preview instance
        val preview = Preview.Builder()
            .build()
            .also {
                it.setSurfaceProvider(previewView.surfaceProvider)
            }

        val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

        try {
            cameraProvider.unbindAll()
            cameraProvider.bindToLifecycle(
                lifecycleOwner, cameraSelector, preview
            )
        } catch (e: Exception) {
            Log.e("CameraPreview", "Camera binding failed", e)
        }
    }, ContextCompat.getMainExecutor(context))
}
