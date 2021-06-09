package integer_break


/*
LeetCode Problems 343:

Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
Return the maximum product you can get.
*/

fun maxProductOfSum(input: Int): Int {
    check(input in (2..58))
    return when (input) {
        2 -> 1
        3 -> 2
        else -> checkProduct(input)
    }
}

fun partition(integer: Int): Pair<Int, Int> =
    integer.let {
        if (integer % 3 == 0)
            Pair(integer - 3, 3)
        else
            Pair(integer - 2, 2)
    }


fun checkProduct(a: Int): Int =
    partition(a).let { (l, r) ->
        if (a in (2..3)) a
        else checkProduct(l) * checkProduct(r)
    }