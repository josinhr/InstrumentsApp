package com.plcoding.instrumentsapp.feature_instruments.domain.use_case

data class InstrumentUseCases (
    val getInstruments: GetInstruments,
    val getInstrument: GetInstrument,
    val addInstrument: AddInstrument,
    val deleteInstrument: DeleteInstrument
)