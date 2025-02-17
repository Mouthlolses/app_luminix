package com.example.app_luminix.ui.player

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


//# Tela principal do player

//Este é o ponto de entrada que une os componentes (VideoPlayer e ControlsOverlay).

@Composable
fun VideoPlayerScreen(videoUrl: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        VideoPlayer(videoUrl = videoUrl)
    }
}