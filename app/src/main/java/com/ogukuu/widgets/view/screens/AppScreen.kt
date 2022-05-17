package com.ogukuu.widgets.view.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.ogukuu.widgets.R
import com.ogukuu.widgets.navigation.WidgetsNavHost
import com.ogukuu.widgets.ui.theme.WidgetsTheme

@Composable
fun AppScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Blue,
                contentColor = Color.White,
                elevation = 12.dp,
                contentPadding = PaddingValues(start = 12.dp)
            ){
                Text(
                    text = stringResource(id = R.string.app_name),
                    fontSize = 24.sp
                )

            }
        },
        content = {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                WidgetsNavHost(navController)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AppScreenPreview(){
    WidgetsTheme {
        AppScreen()
    }
}