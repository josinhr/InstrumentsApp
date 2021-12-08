package com.plcoding.instrumentsapp.feature_instruments.presentation.main_page

import com.plcoding.instrumentsapp.feature_instruments.domain.model.Instrument

data class MainPageState(
    val instruments: List<Instrument> = emptyList(),
    val searchState: String = String()
)
