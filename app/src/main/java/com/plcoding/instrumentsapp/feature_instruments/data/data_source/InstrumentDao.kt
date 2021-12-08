package com.plcoding.instrumentsapp.feature_instruments.data.data_source

import androidx.room.*
import com.plcoding.instrumentsapp.feature_instruments.domain.model.Instrument
import kotlinx.coroutines.flow.Flow

@Dao
interface InstrumentDao {
    @Query ("SELECT * FROM instrument")
    fun getInstruments(): Flow<List<Instrument>>


    @Query ("SELECT * FROM instrument WHERE id = :id")
    suspend fun getInstrumentById(id: Int): Instrument?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addInstrument(instrument: Instrument)

    @Delete
    suspend fun removeInstrument(instrument: Instrument)
}