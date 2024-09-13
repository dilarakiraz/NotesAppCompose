package com.example.notesapp.feature_note.domain.use_case

/**
 * Created by Dilara Kiraz on 13.09.2024.
 */
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
)
