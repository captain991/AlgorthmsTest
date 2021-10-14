package com.lotte.algorithmstest

import kotlin.math.min

/**
 * Created by captain on 2021/10/13 上午12:39}.
 */
class BubbleSort : AbsSort() {

    /**
     * 最简单的实现，没有优化
     */
//    override fun sort(array: IntArray) {
//        val length = array.size
//        for (i in 1 until length) {
//            for (j in 0 until length - i) {
//                if (array[j] > array[j + 1]) {
//                    swap(array, j, j + 1)
//                }
//            }
//        }
//    }

    /**
     * 经过一次优化，如果某一轮过后没有任何交换说明后面不再需要交换了
     * 最好的情况是全部有序,只需比较n-1次,时间复杂度是O(n)
     * 最坏的情况和第一种一样,时间复杂度为O(n2)
     */
//    override fun sort(array: IntArray) {
//        val length = array.size
//        var swap = true
//        for (i in 1 until length) {
//            if (!swap)
//                break
//            swap = false
//            for (j in 0 until length - i) {
//                if (array[j] > array[j + 1]) {
//                    swap = true
//                    swap(array, j, j + 1)
//                }
//            }
//        }
//    }


    /**
     * 经过两次优化
     */
    override fun sort(array: IntArray) {
        val length = array.size
        var lastChangeIndex = length - 1
        var swap = true
        for (i in 1 until length) {
            if (!swap)
                break
            swap = false
            for (j in 0 until min(lastChangeIndex, length - i)) {
                if (array[j] > array[j + 1]) {
                    swap = true
                    swap(array, j, j + 1)
                    lastChangeIndex = j + 1
                }
            }
        }
    }

}