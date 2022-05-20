package com.ogukuu.widgets.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.ogukuu.widgets.view.screens.MainScreen
import com.ogukuu.widgets.view.screens.WidgetDescriptionScreen
import com.ogukuu.widgets.widgets.WidgetStorage

@Composable
fun WidgetsNavHost(navHostController: NavHostController, widgetStorage: WidgetStorage) {

    NavHost(navController = navHostController, startDestination = WidgetsNavRoute.Main.route){
        composable(WidgetsNavRoute.Main.route){
            MainScreen(navHostController, widgetStorage)
        }
        composable(
            "${WidgetsNavRoute.WidgetDescription.route}/{nameWidget}",
            arguments = listOf(navArgument("nameWidget") { type = NavType.StringType })
        ){
            println(it.arguments?.getString("nameWidget"))
            WidgetDescriptionScreen(
                navHostController,
                widgetStorage.widgets[it.arguments?.getString("nameWidget")]
            )
        }
    }
}