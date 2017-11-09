package com.github.zxj5470.ktnl.util

/**
 * @author: zxj5470
 * @date: 17-11-5
 */

fun handleArgs(arg:Array<String>):Array<String> =
        when {
            arg.size != 1 -> {
                println("usage: ktnl.kexe kt.ktnl")
                arrayOf("../kt.ktnl")
            }
            else -> arg
        }