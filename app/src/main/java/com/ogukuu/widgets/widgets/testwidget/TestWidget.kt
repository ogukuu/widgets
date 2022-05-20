package com.ogukuu.widgets.widgets.testwidget

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.ogukuu.widgets.R
import com.ogukuu.widgets.ui.theme.Grey_44
import com.ogukuu.widgets.ui.theme.Grey_BB
import com.ogukuu.widgets.widgets.Widget

class TestWidget(): Widget() {
    
    @Composable
    override fun IconWidget() {
        val on = remember {mutableStateOf(true)}
        Card(
            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    onClick = { on.value = !on.value }
                ),
            backgroundColor = when (on.value) {
                true -> Grey_44
                false -> Grey_BB
            }
        ) {
            Box (
                Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                when (on.value) {
                    true -> Text(text = "ON", color = Grey_BB)
                    false -> Text(text = "OFF", color = Grey_44)
                }
            }
            }

    }

    @Composable
    override fun Description() {
        Text(text = stringResource(id = R.string.test_widget_description))
    }

    @Composable
    override fun DescriptionScreen() {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            IconWidget()
            Divider()
            Description()
        }
    }
}