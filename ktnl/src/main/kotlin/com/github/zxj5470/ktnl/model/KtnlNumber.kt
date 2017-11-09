package com.github.zxj5470.ktnl.model

data class KtnlObject(var type: String,
                      private var value: String) {

    override fun toString(): String =
            when (type) {
                "String"->" $type = \"$value\""
                else->" $type = $value"
            }
}

data class KtnlNumber(
        var type: String,
        var value: Any)