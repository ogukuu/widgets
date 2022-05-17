package com.ogukuu.widgets.widgets.testwidget

import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ogukuu.widgets.widgets.Widget

class TestWidget(val i: Int): Widget() {
    
    @Composable
    override fun Item() {
        Card(
            modifier = Modifier
                .size(40.dp)
        ) {
            Text(text = "TW - $i")
        }
    }

    @Composable
    override fun Description() {
        Text(text = "TestWidget description - $i")
    }

    @Composable
    override fun DescriptionScreen() {
        Text(text = "TestWidget description screen - $i")
    }
}