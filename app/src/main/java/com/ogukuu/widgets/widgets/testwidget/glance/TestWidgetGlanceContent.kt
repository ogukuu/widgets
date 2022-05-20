package com.ogukuu.widgets.widgets.testwidget.glance

import androidx.compose.runtime.Composable
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
import com.ogukuu.widgets.ui.theme.Grey_44
import com.ogukuu.widgets.ui.theme.Grey_BB
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
                    true -> Grey_44
                    false -> Grey_BB
                }
            ),
        contentAlignment = Alignment.Center
    ) {
        when (colorOfWidget){
            true -> Text(text = "ON", style = TextStyle(color = ColorProvider(Grey_BB)))
            false -> Text(text = "OFF", style = TextStyle(color = ColorProvider(Grey_44)))
        }
    }
}