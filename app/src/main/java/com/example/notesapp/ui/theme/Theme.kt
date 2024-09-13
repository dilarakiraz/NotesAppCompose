package com.example.notesapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray

private val DarkColorScheme = darkColorScheme(
    primary = Color.White,
    background = DarkGray,
    onBackground = Color.White,
    surface = LightBlue,
    onSurface = DarkGray
)

private val LightColorScheme = lightColorScheme(
    primary = Color.Black,
    background = LightGray,
    onBackground = Color.Black,
    surface = LightBlue,
    onSurface = LightGray
)

@Composable
fun NoteAppTheme(
    darkTheme: Boolean = true,
    content: @Composable() () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}