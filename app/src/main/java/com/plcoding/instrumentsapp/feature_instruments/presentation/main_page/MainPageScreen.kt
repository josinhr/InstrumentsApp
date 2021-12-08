package com.plcoding.instrumentsapp.feature_instruments.presentation.main_page

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import kotlinx.coroutines.launch

@Composable
fun MainPageScreen(
    navController: NavController,
    viewModel: MainPageViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {

            },
            Modifier.size(65.dp),
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add instrument",
                Modifier.size(40.dp),
                Color.White
            )
        }

    }, scaffoldState = scaffoldState)
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
                    .shadow(elevation = 10.dp, shape = RoundedCornerShape(100.dp))

            ) {
                TextField(
                    value = TextFieldValue(AnnotatedString(state.searchState)),
                    onValueChange = { viewModel.onSearchChanged(it.text) },
                    Modifier
                        .fillMaxWidth()
                        .size(65.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .background(MaterialTheme.colors.surface)

                )
            }
            Spacer(modifier = Modifier.height(150.dp))
            Text(
                text = "All Instruments",
                style = MaterialTheme.typography.h4,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))

            Row(modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth()) {
                for(instrument in state.instruments) {
                    Box(
                        modifier = Modifier.size(100.dp).clip( RoundedCornerShape(10.dp)).background(Color.Red)
                    )
                    Text(text = instrument.name)
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun ComposablePreview() {


    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {

            },
            Modifier.size(65.dp),
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add instrument",
                Modifier.size(40.dp),
                Color.White
            )
        }

    }, scaffoldState = scaffoldState)
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
                    .shadow(elevation = 10.dp, shape = RoundedCornerShape(100.dp))

            ) {
                TextField(
                    value = TextFieldValue("Search"),
                    onValueChange = { },
                    Modifier
                        .fillMaxWidth()
                        .size(65.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .background(MaterialTheme.colors.surface)

                )
            }
            Text(text = "All Instruments")
        }
    }
}