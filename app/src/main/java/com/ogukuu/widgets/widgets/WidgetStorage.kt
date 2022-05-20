package com.ogukuu.widgets.widgets

class WidgetStorage {
    val widgets = mutableMapOf<String,Widget>()
    fun add(nameWidget: String, widget: Widget){
        widgets[nameWidget] = widget
    }
}