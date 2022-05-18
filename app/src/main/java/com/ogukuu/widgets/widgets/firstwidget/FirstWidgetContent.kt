package com.ogukuu.widgets.widgets.firstwidget

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.glance.*
import androidx.glance.action.clickable
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.layout.*
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextAlign
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.ogukuu.widgets.R
import com.ogukuu.widgets.widgets.firstwidget.FirstWidget.Companion.RECOMMENDED_DAILY_GLASSES
import com.ogukuu.widgets.widgets.firstwidget.FirstWidget.Companion.WATER_PREFS_KEY


@SuppressLint("StringFormatInvalid")
@Composable
fun FirstWidgetCounter(
    context: Context,
    glassesOfWater: Int,
    modifier: GlanceModifier
) {
    Text(
        text = "Glasses of Water: $glassesOfWater",
        modifier = modifier,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = ColorProvider(
                color = Color.White
            )
        )
    )
}

@SuppressLint("StringFormatInvalid")
@Composable
fun FirstWidgetGoal(
    context: Context,
    glassesOfWater: Int,
    modifier: GlanceModifier
) {
    Text(
        text = when {
            glassesOfWater >= RECOMMENDED_DAILY_GLASSES -> "You\'ve met the goal!"
            else -> { "Daily Glass Goal:" }
        },
        modifier = modifier,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = ColorProvider(
                color = Color.White
            )
        )
    )
}

@Composable
fun FirstWidgetButtonLayout(
    modifier: GlanceModifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.Vertical.CenterVertically
    ) {
        Text(
            text = "Del",
            modifier = GlanceModifier
                .clickable(
                    onClick = actionRunCallback<ClearWaterClickAction>()
                )
                .defaultWeight()
        )
        Text(
            text = "Add",
            modifier = GlanceModifier
                .clickable(
                    onClick = actionRunCallback<AddWaterClickAction>()
                )
                .defaultWeight()
        )
    }
}

@Composable
fun FirstWidgetContent(
    modifier: GlanceModifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Horizontal.CenterHorizontally
    ) {
        val context = LocalContext.current
        val prefs = currentState<Preferences>()
        val glassesOfWater = prefs[intPreferencesKey(WATER_PREFS_KEY)] ?: 0
        FirstWidgetCounter(
            context = context,
            glassesOfWater = glassesOfWater,
            modifier = GlanceModifier
                .fillMaxWidth()
                .defaultWeight()
        )
        FirstWidgetGoal(
            context = context,
            glassesOfWater = glassesOfWater,
            modifier = GlanceModifier
                .fillMaxWidth()
                .defaultWeight()
        )
        FirstWidgetButtonLayout(
            modifier = GlanceModifier
                .fillMaxSize()
                .defaultWeight()
        )
    }
}