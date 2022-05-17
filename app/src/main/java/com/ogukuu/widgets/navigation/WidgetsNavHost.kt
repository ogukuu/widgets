package com.ogukuu.widgets.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ogukuu.widgets.view.screens.MainScreen
import com.ogukuu.widgets.view.screens.WidgetDescriptionScreen

@Composable
fun WidgetsNavHost(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = WidgetsNavRoute.Main.route){
        composable(WidgetsNavRoute.Main.route){ MainScreen()}
        composable(WidgetsNavRoute.WidgetDescription.route){ WidgetDescriptionScreen()}
    }
}