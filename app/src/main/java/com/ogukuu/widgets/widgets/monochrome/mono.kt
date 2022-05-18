package com.ogukuu.widgets.widgets.monochrome

import android.content.Context
import android.provider.Settings

fun mono(context: Context, on: Boolean) {
    if (on) {
        //Settings.Global.putString(context.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, "1" )
        Settings.Secure.putString(context.contentResolver, "accessibility_display_daltonizer_enabled", "1")
        Settings.Secure.putString(context.contentResolver, "accessibility_display_daltonizer", "0")

    }
    else {
        //Settings.Global.putString(context.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, "0" )
        Settings.Secure.putString(context.contentResolver, "accessibility_display_daltonizer_enabled", "0")
        Settings.Secure.putString(context.contentResolver, "accessibility_display_daltonizer", "-1")
    }
}

/*
DISABLED = -1
MONOCHROMACY = 0
PROTANOMALY = 11
CORRECT_DEUTERANOMALY = 12
TRITANOMALY= 13
*/
