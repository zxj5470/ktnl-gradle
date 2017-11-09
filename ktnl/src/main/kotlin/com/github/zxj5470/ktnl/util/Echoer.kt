package com.github.zxj5470.ktnl.util

/**
 * @author: zxj5470
 * @date: 2017/11/7
 */
object Echoer {
    enum class ForeheadColor(val value: Int=31) {
        BLACK(31),
        RED(32),
        GREEN(33), YELLOW(34), BLUE(35), PURPLE(36), DARK_GREEN(37), WHITE(38), DEFAULT(0)
    }

//    enum class BackgroundColor(value: Int = 40) {
//        BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, DARK_GREEN, WHITE
//    }

    private val b by lazy{
        27.toChar()
    } 
    private val normalString by lazy{
        "$b[0m"
    }

    fun printUnderLine(arg1: kotlin.String?, color: ForeheadColor = ForeheadColor.DEFAULT) {
        val controlStr = "$b[${color.value}m"
        val underline = "$b[4m"
        print("$underline$controlStr$arg1")
        setBackNormal()
    }

    private fun setBackNormal() = print(normalString)

}