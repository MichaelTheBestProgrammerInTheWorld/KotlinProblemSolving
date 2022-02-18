package february2022

fun main() {

    println(runningSum(intArrayOf(1,2,3,4)).asList())
    println(runningSum(intArrayOf(1,1,1,1,1)).asList())
    println(runningSum(intArrayOf(3,1,2,10,1)).asList())
}

fun runningSum(nums: IntArray): IntArray {

    val runningSumArr = IntArray(nums.size)
    runningSumArr[0] = nums[0]
    for (i in 1..nums.size-1){
        runningSumArr[i] = runningSumArr[i-1] + nums[i]
    }
    return runningSumArr
}