package com.plcoding.instrumentsapp.feature_instruments.domain.use_case

import com.plcoding.instrumentsapp.feature_instruments.domain.model.Instrument
import com.plcoding.instrumentsapp.feature_instruments.domain.repository.InstrumentsRepository

class GetInstrument(private val repository: InstrumentsRepository) {
    suspend operator fun invoke(id: Int): Instrument? {
        return repository.getInstrumentById(id)
    }
}