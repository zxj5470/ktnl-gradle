package com.github.zxj5470.ktnl.util.extensions

import com.github.zxj5470.ktnl.constants.*

/**
 * @author: zxj5470
 * @date: 17-11-7
 */
/**
 * Char extensions for asserting something.
 */
inline val Char.isLeftBracket
    get() = this == CharConstants.LEFT_BRACTET

inline val Char.isRightBracket
    get() = this == CharConstants.RIGHT_BRACTET

inline val Char.isWord
    get() = (this.isLetter() || this in StringConstants.ARROW_IDENTIFIERS)

inline val Char.isSpace
    get() = this == CharConstants.SPACE

inline val Char.isNumeric
    get() = (this.isDigit() || this == CharConstants.DOT)

inline val Char.isQuote
    get() = this==CharConstants.QUOTE


