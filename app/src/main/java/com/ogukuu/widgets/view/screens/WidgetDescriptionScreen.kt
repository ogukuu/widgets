package com.ogukuu.widgets.view.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ogukuu.widgets.R
import com.ogukuu.widgets.navigation.WidgetsNavRoute
import com.ogukuu.widgets.ui.theme.Grey_55
import com.ogukuu.widgets.ui.theme.Grey_DD
import com.ogukuu.widgets.ui.theme.WidgetsTheme
import com.ogukuu.widgets.widgets.Widget
import com.ogukuu.widgets.widgets.testwidget.TestWidget

@Composable
fun WidgetDescriptionScreen(navHostController: NavHostController, widget: Widget?) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Grey_55,
                contentColor = Grey_DD,
                elevation = 12.dp,
                contentPadding = PaddingValues(start = 0.dp)
            ){
                IconButton(
                    modifier = Modifier.padding(start = 0.dp),
                    onClick = {
                        navHostController.navigate(WidgetsNavRoute.Main.route)
                    }
                ){
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
                }
                Text(
                    text = stringResource(id = R.string.app_name),
                    fontSize = 24.sp
                )

            }
        },
        content = {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = colorResource(id = R.color.white)
            ) {
                widget?.DescriptionScreen()
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun WidgetDescriptionScreenPreview(){
    WidgetsTheme {
        WidgetDescriptionScreen(navHostController = rememberNavController(), TestWidget())
    }
}