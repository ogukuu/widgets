package com.ogukuu.widgets.widgets.firstwidget

import android.content.Context
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.glance.GlanceId
import androidx.glance.action.ActionParameters
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.state.updateAppWidgetState
import androidx.glance.state.PreferencesGlanceStateDefinition
import com.ogukuu.widgets.widgets.firstwidget.FirstWidget.Companion.MAX_GLASSES
import com.ogukuu.widgets.widgets.firstwidget.FirstWidget.Companion.WATER_PREFS_KEY

class AddWaterClickAction: ActionCallback{
    override suspend fun onRun(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
        updateAppWidgetState(context, PreferencesGlanceStateDefinition, glanceId){
            it.toMutablePreferences()
                .apply {
                    val glassesOfWater = this[intPreferencesKey(WATER_PREFS_KEY)] ?:0
                    if (glassesOfWater < MAX_GLASSES){
                        this[intPreferencesKey(WATER_PREFS_KEY)] = glassesOfWater + 1
                    }
                }
        }
        FirstWidget().update(context, glanceId)
    }
}

class ClearWaterClickAction: ActionCallback{
    override suspend fun onRun(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
        updateAppWidgetState(context, PreferencesGlanceStateDefinition, glanceId){
            it.toMutablePreferences()
                .apply {
                    this[intPreferencesKey(WATER_PREFS_KEY)] = 0
                }
        }
        FirstWidget().update(context, glanceId)
    }

}