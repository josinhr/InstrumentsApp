package com.plcoding.instrumentsapp.di

import android.app.Application
import androidx.room.Room
import com.plcoding.instrumentsapp.feature_instruments.data.data_source.InstrumentDatabase
import com.plcoding.instrumentsapp.feature_instruments.data.repository.InstrumentRepositoryImpl
import com.plcoding.instrumentsapp.feature_instruments.domain.repository.InstrumentsRepository
import com.plcoding.instrumentsapp.feature_instruments.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideInstrumentDatabase(app: Application): InstrumentDatabase {
        return Room.databaseBuilder(
            app,
            InstrumentDatabase::class.java,
            InstrumentDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: InstrumentDatabase): InstrumentsRepository {
        return InstrumentRepositoryImpl(db.instrumentDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: InstrumentsRepository): InstrumentUseCases {
        return InstrumentUseCases(
            getInstrument = GetInstrument(repository),
            getInstruments = GetInstruments(repository),
            addInstrument = AddInstrument(repository),
            deleteInstrument = DeleteInstrument(repository)
        )
    }
}