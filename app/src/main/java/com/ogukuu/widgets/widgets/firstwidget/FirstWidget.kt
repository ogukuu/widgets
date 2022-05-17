package com.ogukuu.widgets.widgets.firstwidget

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.*
import androidx.glance.background
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.state.GlanceStateDefinition
import androidx.glance.state.PreferencesGlanceStateDefinition

class FirstWidget: GlanceAppWidget() {

    override var stateDefinition: GlanceStateDefinition<*> = PreferencesGlanceStateDefinition

    @Composable
    override fun Content() {
        FirstWidgetContent(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(
                    day = Color.Blue,
                    night = Color.DarkGray
                )
                .appWidgetBackground()
                .cornerRadius(16.dp)
                .padding(8.dp),
        )
    }

    companion object {
        const val WATER_PREFS_KEY = "WATER_PREFS_KEY"
        const val RECOMMENDED_DAILY_GLASSES = 8
        const val MAX_GLASSES = 999
    }
}

class FirstWidgetReceiver : GlanceAppWidgetReceiver(){
    override val glanceAppWidget: GlanceAppWidget
        get() = FirstWidget()
}