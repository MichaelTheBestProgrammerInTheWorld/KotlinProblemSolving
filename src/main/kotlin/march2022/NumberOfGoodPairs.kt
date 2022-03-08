package march2022

fun main() {

    println(numIdenticalPairs(intArrayOf(1,2,3,1,1,3)))
    println(numIdenticalPairs(intArrayOf(1,1,1,1)))
    println(numIdenticalPairs(intArrayOf(1,2,3)))
}

fun numIdenticalPairs(nums: IntArray): Int {

    var goodPairs = 0

    for (i in 0..nums.size-1){
        for (j in i+1..nums.size-1){
            if (nums[i] == nums[j]){
                goodPairs++
            }
        }
    }

    return goodPairs
}