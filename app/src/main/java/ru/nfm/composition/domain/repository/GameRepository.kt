package ru.nfm.composition.domain.repository

import ru.nfm.composition.domain.entity.GameSettings
import ru.nfm.composition.domain.entity.Level
import ru.nfm.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ) : Question

    fun getGameSettings(level: Level): GameSettings
}