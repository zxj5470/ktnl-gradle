package com.github.zxj5470.ktnl.parser

import com.github.zxj5470.ktnl.util.extensions.countTimes

/**
 * @author: zxj5470
 * @date: 2017/11/7
 */

val INT_MAX by lazy {
    0x7fff_ffff
}
val LONG_MAX by lazy {
    0x7fff_ffff_ffff_ffff
}

fun String.canBeInt(): Boolean {
    if (this.allDigit()) {
        if (this.length > 10) return false
        else {
            for (i in this.indices) {
                if (this[i] > INT_MAX_STRING[i]) return false
            }
        }
        return true
    } else {
        return false
    }
}

fun String.canBeLong(): Boolean {
    if (this.allDigit()) {
        if (this.length > 19) return false
        else {
            for (i in this.indices) {
                if (this[i] > LONG_MAX_STRING[i]) return false
            }
        }
        return true
    } else {
        return false
    }
}

fun String.canBeDouble():Boolean = this.countTimes('.')==1

fun String.canBeBigDecimal():Boolean = this.allDigit()&&this.canBeLong()==false

val INT_MAX_STRING by lazy {
    "2147483647"
}
val LONG_MAX_STRING by lazy {
    "9223372036854775807"
}

fun String.allDigit(): Boolean {
    for (it in this) {
        if (!it.isDigit()) return false
    }
    return true
}
