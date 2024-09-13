package com.example.notesapp.feature_note.domain.repository

import com.example.notesapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by Dilara Kiraz on 13.09.2024.
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}