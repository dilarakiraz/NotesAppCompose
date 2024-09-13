package com.example.notesapp.feature_note.domain.use_case

import com.example.notesapp.feature_note.domain.model.Note
import com.example.notesapp.feature_note.domain.repository.NoteRepository

/**
 * Created by Dilara Kiraz on 13.09.2024.
 */
class DeleteNote (
    private val repository: NoteRepository
){
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}