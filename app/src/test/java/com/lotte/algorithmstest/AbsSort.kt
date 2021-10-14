package com.lotte.algorithmstest

import kotlin.random.Random

/**
 * @author Josh
 * Created on 2021/10/12 11:03
 */
abstract class AbsSort {

    abstract fun sort(array: IntArray)

    fun start() {
        start(10)
    }

    fun start(size: Int) {
        val source = IntArray(size) { Random.nextInt(size / 2) }
        start(source)
    }

    fun start(source: IntArray) {
        val t1 = System.currentTimeMillis()
        val size = source.size
//        if (size < 20)
            println("array before sorted:${source.contentToString()}")
        println("time before sort:${t1}")
        sort(source)
        val t2 = System.currentTimeMillis()
//        if (size < 20)
            println("array after sorted:${source.contentToString()}")
        println("time after sort:${t2},consumed:${t2 - t1}")
    }

    fun swap(array: IntArray, i: Int, j: Int) {
        array[i] = array[i] + array[j]
        array[j] = array[i] - array[j]
        array[i] = array[i] - array[j]
    }

}