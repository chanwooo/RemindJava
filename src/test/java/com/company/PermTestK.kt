package com.company

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*
import java.util.Collections.emptyList
import kotlin.collections.HashSet

class PermTestK {
    fun permute(nums: IntArray): List<List<Int>> {
        val queue = LinkedList<List<Int>>()
        queue.add(emptyList<Int>())

        while (true){
            val size = queue.size
            for(num in 1..size){
                val temp = queue.remove()
                for (int in nums){
                    if(!temp.contains(int)){
                        queue.add(temp+int)
                    }
                }
            }
            if(queue.peek().size==nums.size){break}
        }
        return queue.toList()
    }

    @Test
    fun test() {
        val perm = PermTestK()
        val ans = perm.permute(intArrayOf(1,2,3))
        Assertions.assertEquals(6, ans.size)


    }
}