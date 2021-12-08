package com.plcoding.instrumentsapp.feature_instruments.domain.repository

import com.plcoding.instrumentsapp.feature_instruments.domain.model.Instrument
import kotlinx.coroutines.flow.Flow

interface InstrumentsRepository {

    fun getInstruments(): Flow<List<Instrument>>
    suspend fun getInstrumentById(id: Int): Instrument?
    suspend fun addInstrument(instrument: Instrument)
    suspend fun deleteInstrument(instrument: Instrument)
}