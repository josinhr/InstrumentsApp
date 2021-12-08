package com.plcoding.instrumentsapp.feature_instruments.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.lang.Exception

@Entity
class Instrument (
    val name: String,
    val price: Double,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val instrumentFamily = listOf("String", "Brass","Drums", "Woodwind","Keyboard" )
    }

}

class InvalidInstrumentException(message: String) : Exception(message)