package com.plcoding.instrumentsapp.feature_instruments.data.repository

import com.plcoding.instrumentsapp.feature_instruments.data.data_source.InstrumentDao
import com.plcoding.instrumentsapp.feature_instruments.domain.model.Instrument
import com.plcoding.instrumentsapp.feature_instruments.domain.repository.InstrumentsRepository
import kotlinx.coroutines.flow.Flow

class InstrumentRepositoryImpl(private val instrumentDao: InstrumentDao) : InstrumentsRepository {
    override fun getInstruments(): Flow<List<Instrument>> {
        return instrumentDao.getInstruments()
    }

    override suspend fun getInstrumentById(id: Int): Instrument? {
        return instrumentDao.getInstrumentById(id)
    }

    override suspend fun addInstrument(instrument: Instrument) {
        return instrumentDao.addInstrument(instrument)
    }

    override suspend fun deleteInstrument(instrument: Instrument) {
        return instrumentDao.removeInstrument(instrument)
    }
}