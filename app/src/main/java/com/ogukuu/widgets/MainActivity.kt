package com.ogukuu.widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.ogukuu.widgets.navigation.WidgetsNavHost
import com.ogukuu.widgets.ui.theme.WidgetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WidgetsTheme {
                WidgetsNavHost(rememberNavController())
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WidgetsTheme {
        WidgetsNavHost(rememberNavController())
    }
}