package com.pingerx.codelabs.leetcode

/**
 * @author Pinger
 * @since 2019/2/18 17:41
 *
 * Main函数
 */

fun main() {
    println("---------------------")

    val data = NumsCount()
    val twoSum = data.twoSum(intArrayOf(5, 5, 15, 19, 34, 78, 91), 10)
    twoSum.forEach {
        println("--------> $it")
    }


    println("---------------------")
}