package com.example.notesapp.feature_note.domain.util

/**
 * Created by Dilara Kiraz on 13.09.2024.
 */
sealed class NoteOrder (val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)
}