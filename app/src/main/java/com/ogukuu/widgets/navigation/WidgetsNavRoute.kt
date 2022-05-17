package com.ogukuu.widgets.navigation

import com.ogukuu.widgets.misc.Constants

sealed class WidgetsNavRoute(val route: String) {
    object Main: WidgetsNavRoute(Constants.Screens.MAIN_SCREEN)
    object WidgetDescription: WidgetsNavRoute(Constants.Screens.WIDGET_DESCRIPTION_SCREEN)
}