package com.example.app_luminix.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app_luminix.R


@Composable
fun HomeScreen() {

    val gradient = Brush.linearGradient(
        colors = listOf(Color(0xFF102B44), Color(0xFF1B5D4D)),
        start = Offset(0f, 0f),
        end = Offset(1000f, 1000f)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(gradient)
            .padding(WindowInsets.systemBars.asPaddingValues())  // Utilizado para respeitar as margens do sistema
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .width(150.dp)
                .height(100.dp),
        ) {
            Box() {
                Image(
                    painter = painterResource(R.drawable.logoluminix),
                    contentDescription = "Image",
                    modifier = Modifier
                        .size(200.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))
        // Primeira LazyRow
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp), // Espaçamento entre as LazyRows
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            item { ItemCard(Color.Black) }
            item { ItemCard(Color.Cyan) }
            item { ItemCard(Color.Cyan) }
        }

        // Segunda LazyRow
        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            item { ItemCard(Color.Black) }
            item { ItemCard(Color.Cyan) }
            item { ItemCard(Color.Cyan) }
        }
    }
}

// Composable reutilizável para os Cards
@Composable
fun ItemCard(backgroundColor: Color) {
    Card(
        modifier = Modifier
            .width(150.dp)
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Image"
        )
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}