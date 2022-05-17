package com.ogukuu.widgets.view.screens

import androidx.compose.foundation.layout.Column
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ogukuu.widgets.R
import com.ogukuu.widgets.ui.theme.WidgetsTheme
import com.ogukuu.widgets.view.elements.WidgetCard
import com.ogukuu.widgets.widgets.testwidget.TestWidget

@Composable
fun MainScreen(navHostController: NavHostController) {
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
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    WidgetCard(navHostController, TestWidget(1))
                    WidgetCard(navHostController, TestWidget(2))
                    WidgetCard(navHostController, TestWidget(3))
                    WidgetCard(navHostController, TestWidget(4))
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    WidgetsTheme {
        MainScreen(navHostController = rememberNavController())
    }
}