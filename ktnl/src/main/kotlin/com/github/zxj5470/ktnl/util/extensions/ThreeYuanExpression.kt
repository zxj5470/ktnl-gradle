package com.github.zxj5470.ktnl.util.extensions


/**
 * @from: Kotlinx wechat
 * @author: BennyHuo,今天三块钱
 * @update: 17-11-7
 */

infix fun <T> Boolean.问号(value: T?) = 三块钱表达式(this, value)

class 三块钱表达式<T>(val value: Boolean, val valueForTrue: T?)

infix fun <T> 三块钱表达式<T>.冒号(valueForFalse: T?) = if(value) valueForTrue else valueForFalse