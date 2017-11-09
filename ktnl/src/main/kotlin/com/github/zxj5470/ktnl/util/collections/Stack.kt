package com.github.zxj5470.ktnl.util.collections

/**
 * @author: zxj5470
 * @date: 17-11-6
 */

import com.github.zxj5470.ktnl.util.intreface.IStack

class Stack<E> : IStack<E>, Iterable<E> {

    var size = 0
    var first: Node<E>? = null
    var last: Node<E>? = null

    inner class Node<E>(var prev: Node<E>?, var item: E?, var next: Node<E>?)

    internal fun node(index: Int): Node<E> {
        var x: Node<E>
        if (index < size shr 1) {
            x = first!!
            for (i in 0 until index)
                x = x.next!!
        } else {
            x = last!!
            for (i in size - 1 downTo index + 1)
                x = x.prev!!
        }
        return x
    }

    private inner class ListItr internal constructor(private var nextIndex: Int = 0) : ListIterator<E> {
        private var lastReturned: Node<E>? = null
        private var next: Node<E>? = null

        init {
            next = if (nextIndex == size) null; else node(nextIndex)
        }

        override fun hasNext(): Boolean = nextIndex < size

        override fun next(): E {
            if (!hasNext())
                throw NoSuchElementException()
            lastReturned = next
            next = next!!.next
            nextIndex++
            return lastReturned!!.item!!
        }

        override fun hasPrevious(): Boolean = nextIndex > 0

        override fun previous(): E {
            if (!hasPrevious())
                throw NoSuchElementException()
            next = if (next == null) last else next!!.prev
            lastReturned = next
            nextIndex--
            return lastReturned!!.item!!
        }

        override fun nextIndex(): Int = nextIndex

        override fun previousIndex(): Int = nextIndex - 1

    }

    override fun push(e: E) {
        linkFirst(e)
    }

    override fun pop(): E? {
        if (first != null) {
            return unlinkFirst(first!!)
        }
        return null
    }

    override fun isEmpty() = getSize() == 0

    fun isNotEmpty() = getSize() != 0

    override fun getSize() = size

    override fun peek(): E? {
        val f = first
        return f?.item
    }

    override fun iterator(): Iterator<E> = ListItr()


    private fun linkFirst(e: E) {
        val f: Node<E>? = first
        val newNode: Node<E> = Node(null, e, f)
        first = newNode
        if (f == null)
            last = newNode
        else
            f.prev = newNode
        size++
    }

    private fun unlinkFirst(f: Node<E>): E? {
        val element = f.item
        val next = f.next
        f.item = null
        f.next = null
        first = next
        if (next == null)
            last = null
        else
            next.prev = null
        size--
        return element
    }
}
