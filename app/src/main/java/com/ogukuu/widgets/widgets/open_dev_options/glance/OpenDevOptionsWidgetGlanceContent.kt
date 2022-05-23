package com.ogukuu.widgets.widgets.open_dev_options.glance

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceModifier
import androidx.glance.LocalContext
import androidx.glance.action.clickable
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.text.Text
import androidx.glance.text.TextAlign
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.ogukuu.widgets.R
import com.ogukuu.widgets.ui.theme.Grey_44
import com.ogukuu.widgets.ui.theme.Grey_BB


@Composable
fun OpenDevOptionsWidgetGlanceContent(modifier: GlanceModifier) {
    val context = LocalContext.current
    Box(
        modifier = modifier
            .clickable(
                onClick = actionRunCallback<OpenDevOptionsWidgetGlanceAction>()
            )
            .background(
                color = Grey_BB
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = context.getString(R.string.open_dev_options_widget_text),
            style = TextStyle(
                color = ColorProvider(Grey_44),
                textAlign = TextAlign.Center,
                fontSize = 14.sp
            )
        )
    }
}