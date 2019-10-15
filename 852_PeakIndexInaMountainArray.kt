package com.example.musically.myretrofit

/**
 * <pre>
 *     author : 王磊
 *     time   : 2019/10/15
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class Solution {
    fun peakIndexInMountainArray(A: IntArray): Int {
        for(index in 1..A.size - 2) {
            if (A[index] > A[index - 1] && A[index] > A[index + 1]) {
                return index
            }
        }
        return -1
    }
}