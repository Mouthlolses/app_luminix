package com.example.app_luminix.ui.player

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext


//# Tela principal do player

//Este é o ponto de entrada que une os componentes (VideoPlayer e ControlsOverlay).

@Composable
fun VideoPlayerScreen(videoUrl: String) {

    val context = LocalContext.current

    // Use o remember para manter a instância do ExoPlayer durante a recomposição
    val exoPlayer = rememberExoPlayer(context, videoUrl)

    // Estado de controle para o botão play/pause
    var isPlaying by remember { mutableStateOf(true) }

    // Função de Play/Pause
    val onPlayPause = {
        isPlaying = !isPlaying
        if (isPlaying) {
            exoPlayer.playWhenReady = true
            exoPlayer.play() // Inicia a reprodução
        } else {
            exoPlayer.playWhenReady = false
            exoPlayer.pause() // Pausa a reprodução
        }
    }

    // Função de Stop
    val onStop = {
        isPlaying = false
        exoPlayer.seekTo(0)
        exoPlayer.stop()  // Também pode ser exoPlayer.stop()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        VideoPlayer(videoUrl = videoUrl)
    }
}