package com.example.notesapp.feature_note.domain.util

/**
 * Created by Dilara Kiraz on 13.09.2024.
 */
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}