package com.plcoding.instrumentsapp.feature_instruments.domain.use_case

import com.plcoding.instrumentsapp.feature_instruments.domain.model.Instrument
import com.plcoding.instrumentsapp.feature_instruments.domain.repository.InstrumentsRepository
import kotlinx.coroutines.flow.Flow

class GetInstruments(private val instrumentsRepository: InstrumentsRepository) {

    operator fun invoke(): Flow<List<Instrument>> {
        return instrumentsRepository.getInstruments()
    }
}