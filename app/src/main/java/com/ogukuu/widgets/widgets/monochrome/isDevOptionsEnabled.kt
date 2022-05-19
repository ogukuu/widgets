package com.ogukuu.widgets.widgets.monochrome

import android.content.Context
import android.content.Intent
import android.provider.Settings
import androidx.core.content.res.TypedArrayUtils.getString
import androidx.glance.LocalContext

fun isDevOptionsEnabled(context: Context): String {
    return Settings.Global.getString(context.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED)
}

// Settings.Global.getString(context.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED)
// Settings.Secure.getString(context.contentResolver, Settings.Secure.DEVELOPMENT_SETTINGS_ENABLED) deprecated 17
// "1" on toggle in DevOptions
// "0" off toggle in DevOptions


// context.startActivity(Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS))
// open Developer Options if there is access