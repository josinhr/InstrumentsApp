package com.plcoding.instrumentsapp.feature_instruments.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.instrumentsapp.feature_instruments.domain.model.Instrument

@Database(
    entities = [Instrument::class],
    version = 1
)
abstract class InstrumentDatabase: RoomDatabase(){
    abstract val instrumentDao: InstrumentDao

    companion object{
        const val DATABASE_NAME = "instrument_db"
    }
}