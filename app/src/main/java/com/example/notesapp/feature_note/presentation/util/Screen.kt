package com.example.notesapp.feature_note.presentation.util

/**
 * Created by Dilara Kiraz on 15.09.2024.
 */
sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}