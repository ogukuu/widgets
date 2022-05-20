package com.ogukuu.widgets.view.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ogukuu.widgets.R
import com.ogukuu.widgets.ui.theme.Grey_55
import com.ogukuu.widgets.ui.theme.Grey_DD
import com.ogukuu.widgets.ui.theme.WidgetsTheme
import com.ogukuu.widgets.view.elements.WidgetCard
import com.ogukuu.widgets.widgets.testwidget.TestWidget

@Composable
fun MainScreen(navHostController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Grey_55,
                contentColor = Grey_DD,
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
                color = colorResource(id = R.color.white)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(
                            state = ScrollState(initial = 0)
                        )
                ) {
                    WidgetCard(navHostController, TestWidget())
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