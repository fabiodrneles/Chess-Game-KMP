package org.example.project.pieces

interface Pieces {
    val color: Color


    enum class Color {
        White,
        Black
    }
}