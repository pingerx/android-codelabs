package com.pingerx.codelabs.leetcode

/**
 * @author Pinger
 * @since 2019/2/18 01:31
 *
 *  给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *  你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *  示例:
 *  给定 nums = [2, 7, 11, 15], target = 9
 *  因为 nums[0] + nums[1] = 2 + 7 = 9
 *  所以返回 [0, 1]
 *
 */
class NumsCount {


    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = hashSetOf<Int>()
        for (i in 0 until nums.size) {
            for (j in i until nums.size) {
                if (nums[i] != nums[j] && nums[i] + nums[j] == target) {
                    result.add(i)
                    result.add(j)
                }
            }
        }
        return result.toIntArray().sortedArray()
    }


}