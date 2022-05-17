package com.ogukuu.widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ogukuu.widgets.ui.theme.WidgetsTheme
import com.ogukuu.widgets.view.screens.AppScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WidgetsTheme {
                AppScreen()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WidgetsTheme {
        AppScreen()
    }
}