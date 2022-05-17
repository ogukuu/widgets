package com.ogukuu.widgets.view.screens

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ogukuu.widgets.ui.theme.WidgetsTheme

@Composable
fun AppScreen() {
    Text(text = "AppScreen")
}

@Preview(showBackground = true)
@Composable
fun AppScreenPreview(){
    WidgetsTheme {
        AppScreen()
    }
}