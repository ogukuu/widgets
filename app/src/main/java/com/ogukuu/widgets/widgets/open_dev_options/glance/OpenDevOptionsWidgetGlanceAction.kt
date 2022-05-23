package com.ogukuu.widgets.widgets.open_dev_options.glance

import android.content.Context
import android.content.Intent
import android.provider.Settings
import androidx.glance.GlanceId
import androidx.glance.action.ActionParameters
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.state.updateAppWidgetState
import androidx.glance.state.PreferencesGlanceStateDefinition


class OpenDevOptionsWidgetGlanceAction: ActionCallback {
    override suspend fun onRun(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
        updateAppWidgetState(context, PreferencesGlanceStateDefinition, glanceId){
            it.toMutablePreferences()
                .apply {
                    context.startActivity(Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS))
                }
        }
        OpenDevOptionsWidgetGlance().update(context, glanceId)
        // если сюда вставить другой виджет, то после экшона произойдёт замена виджета
        // например
        // TestWidgetGlance().update(context, glanceId)
    }
}