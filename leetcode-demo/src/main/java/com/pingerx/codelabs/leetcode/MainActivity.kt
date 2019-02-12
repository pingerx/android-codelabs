package com.pingerx.codelabs.leetcode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val count = NumsCount()

        val result = count.twoSum(intArrayOf(3, 2, 4), 6)

        result.forEach {
            println("----> it = " + it)
        }

    }
}
