package com.ogukuu.widgets.view.elements

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ogukuu.widgets.ui.theme.WidgetsTheme


@Composable
fun WidgetCard() {
    Text(text = "WidgetCard")
}

@Preview(showBackground = true)
@Composable
fun WidgetCardPreview(){
    WidgetsTheme {
        WidgetCard()
    }
}