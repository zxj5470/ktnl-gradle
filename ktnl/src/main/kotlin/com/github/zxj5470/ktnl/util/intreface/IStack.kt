package com.github.zxj5470.ktnl.util.intreface

interface IStack<E>{
    fun push(e:E)
    fun pop():E?
    fun peek():E?
    fun isEmpty():Boolean
    fun getSize():Int
}