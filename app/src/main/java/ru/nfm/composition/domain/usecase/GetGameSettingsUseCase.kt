package ru.nfm.composition.domain.usecase

import ru.nfm.composition.domain.entity.GameSettings
import ru.nfm.composition.domain.entity.Level
import ru.nfm.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}