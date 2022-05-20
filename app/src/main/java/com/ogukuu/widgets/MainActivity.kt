package com.ogukuu.widgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.ogukuu.widgets.navigation.WidgetsNavHost
import com.ogukuu.widgets.ui.theme.WidgetsTheme
import com.ogukuu.widgets.widgets.WidgetStorage
import com.ogukuu.widgets.widgets.testwidget.TestWidget

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WidgetsTheme {

                val widgets = WidgetStorage()

                // add widgets
                widgets.add(getString(R.string.test_widget), TestWidget()) // getString(R.string.test_widget) this line has localization, problems?
                //-----

                WidgetsNavHost(rememberNavController(), widgets)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WidgetsTheme {
        WidgetsNavHost(rememberNavController(), WidgetStorage())
    }
}