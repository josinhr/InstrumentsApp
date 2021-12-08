package com.plcoding.instrumentsapp.feature_instruments.domain.use_case

import com.plcoding.instrumentsapp.feature_instruments.domain.model.Instrument
import com.plcoding.instrumentsapp.feature_instruments.domain.model.InvalidInstrumentException
import com.plcoding.instrumentsapp.feature_instruments.domain.repository.InstrumentsRepository

class AddInstrument(
    private val repository: InstrumentsRepository
) {
    suspend operator fun invoke(instrument: Instrument) {
        if (instrument.name.isBlank()) {
            throw InvalidInstrumentException("The name of the instrument can't be empty")
        }
        repository.addInstrument(instrument)
    }
}