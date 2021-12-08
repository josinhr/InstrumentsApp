package com.plcoding.instrumentsapp.feature_instruments.presentation.main_page

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.plcoding.instrumentsapp.feature_instruments.domain.use_case.InstrumentUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainPageViewModel @Inject constructor(
    private val instrumentUseCases: InstrumentUseCases
) :ViewModel() {
    fun onSearchChanged(it: String) {
        TODO("Not yet implemented")
    }

    private val _state = mutableStateOf<MainPageState>(MainPageState())
    val state: State<MainPageState> = _state


}