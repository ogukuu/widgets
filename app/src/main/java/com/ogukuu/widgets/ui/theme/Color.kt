package com.ogukuu.widgets.ui.theme

import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Grey_00 = Color(0xFF000000)
val Grey_11 = Color(0xFF111111)
val Grey_22 = Color(0xFF222222)
val Grey_33 = Color(0xFF333333)
val Grey_44 = Color(0xFF444444)
val Grey_55 = Color(0xFF555555)
val Grey_66 = Color(0xFF666666)
val Grey_77 = Color(0xFF777777)
val Grey_88 = Color(0xFF888888)
val Grey_99 = Color(0xFF999999)
val Grey_AA = Color(0xFFAAAAAA)
val Grey_BB = Color(0xFFBBBBBB)
val Grey_CC = Color(0xFFCCCCCC)
val Grey_DD = Color(0xFFDDDDDD)
val Grey_EE = Color(0xFFEEEEEE)
val Grey_FF = Color(0xFFFFFFFF)


fun getGrey(i: Int): Color{
    val colorRange = 0..255
    if (i !in colorRange) { return Color.Black}
    return Color(i,i,i,0xFF)
}