package com.ogukuu.widgets.view.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ogukuu.widgets.misc.VerticalDivider
import com.ogukuu.widgets.navigation.WidgetsNavRoute
import com.ogukuu.widgets.ui.theme.Grey_33
import com.ogukuu.widgets.ui.theme.Grey_EE
import com.ogukuu.widgets.ui.theme.WidgetsTheme
import com.ogukuu.widgets.widgets.Widget
import com.ogukuu.widgets.widgets.testwidget.TestWidget


@Composable
fun WidgetCard(navHostController: NavHostController, widget: Widget) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 4.dp),
        elevation = 1.dp,
        backgroundColor = Grey_EE
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(
                modifier = Modifier
                    .padding(all = 6.dp)
                    .requiredSize(70.dp),
                contentAlignment = Alignment.Center
            ){
                widget.IconWidget()
            }

            VerticalDivider(height = 50.dp, color = Grey_33)

            Box(
                modifier = Modifier
                    .padding(all = 6.dp)
                    .fillMaxWidth()
                    .clickable(
                        onClick = {
                            navHostController.navigate(WidgetsNavRoute.WidgetDescription.route)
                        }
                    ),
                contentAlignment = Alignment.CenterStart
            ){
                widget.Description()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WidgetCardPreview(){
    WidgetsTheme {
        WidgetCard(navHostController = rememberNavController(), TestWidget(0))
    }
}