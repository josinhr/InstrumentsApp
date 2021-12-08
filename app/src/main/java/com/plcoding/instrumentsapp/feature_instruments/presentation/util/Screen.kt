package com.plcoding.instrumentsapp.feature_instruments.presentation.util

sealed class Screen(val route: String){
    object MainScreen: Screen("main_screen")
}
