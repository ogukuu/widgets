package com.ogukuu.widgets.misc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun VerticalDivider(height: Dp, color: Color = Color.Black, width: Dp = 1.dp) {
    Box(
        modifier = Modifier
            .background(
                color = color
            )
            .requiredHeight(height)
            .requiredWidth(width),
    )
}