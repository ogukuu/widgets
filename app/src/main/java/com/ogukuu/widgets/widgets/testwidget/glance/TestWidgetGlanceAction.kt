package com.ogukuu.widgets.widgets.testwidget.glance

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.glance.GlanceId
import androidx.glance.action.ActionParameters
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.state.updateAppWidgetState
import androidx.glance.state.PreferencesGlanceStateDefinition

class TestWidgetGlanceAction: ActionCallback {
    override suspend fun onRun(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
        updateAppWidgetState(context, PreferencesGlanceStateDefinition, glanceId){
            it.toMutablePreferences()
                .apply {
                    val colorOfWidget = this[booleanPreferencesKey(TestWidgetGlance.COLOR_PREFS_KEY)] ?:false
                    this[booleanPreferencesKey(TestWidgetGlance.COLOR_PREFS_KEY)] = !colorOfWidget
                }
        }
        TestWidgetGlance().update(context, glanceId)
    }
}