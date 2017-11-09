package com.github.zxj5470.ktnl.util.extensions

/**
 * @author: zxj5470
 * @date: 2017/11/7
 */

inline val <T> Collection<T>.last
    get() = this.last()

fun HashMap<String,Any>.println(){
    val sb = StringBuilder()
    sb.append("{")
    var i = 0
    val it = this.iterator()
    while (it.hasNext()) {
        if (i > 0) sb.append(", ")
        val n=it.next()
        sb.append(n.key)
        sb.append(":")
        sb.append(n.value)
        i++
    }
    sb.append("}")
    println(sb.toString())
}