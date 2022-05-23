package com.ogukuu.widgets.widgets.open_dev_options

import android.content.Intent
import android.provider.Settings
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ogukuu.widgets.R
import com.ogukuu.widgets.ui.theme.Grey_44
import com.ogukuu.widgets.ui.theme.Grey_BB
import com.ogukuu.widgets.widgets.Widget

class OpenDevOptionsWidget: Widget() {

    @Composable
    override fun IconWidget() {
        val context = LocalContext.current
        Card(
            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    onClick = {
                        context.startActivity(Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS))
                    }
                ),
            backgroundColor = Grey_BB
        ) {
            Box (
                Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = stringResource(R.string.open_dev_options_widget_text),
                    color = Grey_44,
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp
                )
            }
        }

    }

    @Composable
    override fun Description() {
        Text(text = stringResource(id = R.string.open_dev_options_widget_description))
    }

    @Composable
    override fun DescriptionScreen() {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(
                modifier = Modifier
                    .padding(all = 10.dp)
                    .requiredSize(100.dp),
                contentAlignment = Alignment.Center
            ){
                IconWidget()
            }
            Divider(
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        bottom = 10.dp
                    )
            )
            Description()
        }
    }
}