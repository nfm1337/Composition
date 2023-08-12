package ru.nfm.composition.domain.entity

import java.io.Serializable

data class GameResult(
    val isWinner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
) : Serializable