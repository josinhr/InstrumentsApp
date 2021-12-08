package com.plcoding.instrumentsapp.feature_instruments.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.plcoding.instrumentsapp.feature_instruments.presentation.main_page.MainPageScreen
import com.plcoding.instrumentsapp.feature_instruments.presentation.util.Screen
import com.plcoding.instrumentsapp.ui.theme.InstrumentsApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class MainActivity : ComponentActivity() {
    //@ExperimentalAnimationApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstrumentsApp {
                Surface() {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.MainScreen.route
                    ) {
                        composable(route = Screen.MainScreen.route) {
                            MainPageScreen(navController = navController)
                        }
                    }

                }
            }
        }
    }
}
