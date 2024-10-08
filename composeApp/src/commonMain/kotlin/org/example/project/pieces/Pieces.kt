package org.example.project.pieces

import androidx.compose.ui.unit.IntOffset
import org.jetbrains.compose.resources.DrawableResource

interface Pieces {
    val color: Color


    enum class Color {
        White,
        Black
    }

    val drawable: DrawableResource

    val position: IntOffset

    fun getAvailableMoves(pieces: List<Pieces>): List<IntOffset>


}