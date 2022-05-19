package com.ogukuu.widgets.widgets

import androidx.compose.runtime.Composable

abstract class Widget {

    @Composable
    abstract fun IconWidget()

    @Composable
    abstract fun Description()

    @Composable
    abstract fun DescriptionScreen()
}