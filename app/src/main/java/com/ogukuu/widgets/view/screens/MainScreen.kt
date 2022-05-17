package com.ogukuu.widgets.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ogukuu.widgets.ui.theme.WidgetsTheme
import com.ogukuu.widgets.view.elements.WidgetCard

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        WidgetCard()
        WidgetCard()
        WidgetCard()
        WidgetCard()
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    WidgetsTheme {
        MainScreen()
    }
}