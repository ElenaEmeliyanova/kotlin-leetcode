package integer_break

import java.lang.Integer.max


/*
LeetCode Problems 343:

Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
Return the maximum product you can get.
*/

fun maxProductOfSum(input: Int): Int {
    check(input in (2..58))
    return when(input){
        2 ->  1
        3 ->  2
        else -> checkProduct(input)
    }
}

fun breakToSum(integer: Int): Pair<Int, Int> = Pair(integer / 2, integer - (integer / 2))

fun checkProduct(a: Int): Int {
    val (left, right) = breakToSum(a)
    if (left == 1 || right == 1 || a >= left * right) return a
    return checkProduct(left) * checkProduct(right)
}