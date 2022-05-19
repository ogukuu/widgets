package com.ogukuu.widgets.widgets.testwidget.glance

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.glance.GlanceModifier
import androidx.glance.action.clickable
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.background
import androidx.glance.currentState
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.ogukuu.widgets.ui.theme.getGrey
import com.ogukuu.widgets.widgets.testwidget.glance.TestWidgetGlance.Companion.COLOR_PREFS_KEY

@Composable
fun TestWidgetGlanceContent(modifier: GlanceModifier) {
    val prefs = currentState<Preferences>()
    val colorOfWidget = prefs[booleanPreferencesKey(COLOR_PREFS_KEY)] ?:false
    Box(
        modifier = modifier
            .clickable(
                onClick = actionRunCallback<TestWidgetGlanceAction>()
            )
            .background(
                color = when (colorOfWidget){
                    true -> getGrey(20)
                    false -> Color.Gray
                }
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "TEST",
            style = TextStyle(
                color = when(colorOfWidget){
                    true -> ColorProvider(Color.Gray)
                    false -> ColorProvider(Color.White)
                },
                fontSize = 18.sp
            )
        )
    }
}