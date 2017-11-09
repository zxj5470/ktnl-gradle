package com.github.zxj5470.ktnl.util

/**
 * @author: zxj5470
 * @date: 17-11-7
 */

import kotlinx.cinterop.*
import platform.posix.*

class FileUtil(filePath: String, mode: String="r") {
    var file: CArrayPointer<FILE>? = null

    init {
        file = fopen(filePath, mode)
    }

    fun readText()=file!!.readText()

}

fun CArrayPointer<FILE>.readText(): String {
    val file = this
    val sb = StringBuilder()
    try {
        memScoped {
            //one line 10KB
            val bufferLength = 10 * 1024
            //readOneLine
            val buffer = allocArray<ByteVar>(bufferLength)
            var lines = fgets(buffer, bufferLength, file)
            while (lines != null) {
                sb.append(lines.toKString())
                lines = fgets(buffer, bufferLength, file)
            }
        }
    } finally {
        fclose(file)
    }
    return sb.toString()
}