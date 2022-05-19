package com.ogukuu.widgets.widgets.testwidget

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ogukuu.widgets.widgets.Widget

class TestWidget(private val i: Int): Widget() {
    
    @Composable
    override fun IconWidget() {
        Card(
            modifier = Modifier
                .fillMaxSize()
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