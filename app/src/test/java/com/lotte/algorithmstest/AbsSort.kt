package com.lotte.algorithmstest

import kotlin.random.Random

/**
 * @author Josh
 * Created on 2021/10/12 11:03
 */
abstract class AbsSort {

    abstract fun sort(array: IntArray)

    fun run() {
        val source = IntArray(10) { Random.nextInt(20) }
        println("array before sort:${source.contentToString()}")
        sort(source)
        println("array after sort:${source.contentToString()}")
    }

}