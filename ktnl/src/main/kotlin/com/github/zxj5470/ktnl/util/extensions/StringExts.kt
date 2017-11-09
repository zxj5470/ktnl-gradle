package com.github.zxj5470.ktnl.util.extensions

/**
 * personal Copy Right!!!!
 * @author: zxj5470
 * @date: 2017/11/8
 * @from: https://github.com/zxj5470/KotlinExt/blob/master/android-kotlin-ext/src/main/java/com/github/zxj5470/android_kotlin_ext/str/StringExt.kt
 */

/**
 * count source string appeared times in source string
 * @param regex String : the string to match source string
 * @return List<Int>: a list of all match indices
 */
fun String.indicesOf(regex: String): List<Int> {
    val ll = ArrayList<Int>()
    var temp = -1
    var b: Int
    this.forEachIndexed { index, _ ->
        b = this.indexOf(regex, index)
        if (b > temp) {
            temp = b
            ll.add(temp)
        }
    }
    return ll.toList()
}

/**
 * count source string appeared times in source string
 * @param regex String : the string to match source string
 * @return Int: count how many times appeared.
 * @author :zxj5470
 */
fun String.countTimes(regex: String): Int {
    var count = 0
    var temp = -1
    var b: Int
    this.forEachIndexed { index, _ ->
        b = this.indexOf(regex, index)
        if (b > temp) {
            temp = b
            count++
        }
    }
    return count
}

fun String.countTimes(regex: Char): Int {
    var count = 0
    var temp = -1
    var b: Int
    this.forEachIndexed { index, _ ->
        b = this.indexOf(regex, index)
        if (b > temp) {
            temp = b
            count++
        }
    }
    return count
}

fun String.isNumeric():Boolean{
    for(i in this){
        if(!i.isNumeric)return false
    }
    return true
}
/**
 * StringBuilder extension functions
 */
fun StringBuilder.removeAll() {
    this.length = 0
}