package com.ogukuu.widgets.view.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ogukuu.widgets.ui.theme.WidgetsTheme

@Composable
fun MainScreen() {
    Text(text = "MainScreen")
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    WidgetsTheme {
        MainScreen()
    }
}