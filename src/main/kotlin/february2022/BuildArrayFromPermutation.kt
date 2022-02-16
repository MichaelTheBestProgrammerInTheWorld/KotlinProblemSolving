package february2022

fun main() {

    println(buildArray(intArrayOf(0,2,1,5,3,4)).asList())
    println(buildArray(intArrayOf(5,0,1,2,3,4)).asList())
}

fun buildArray(nums: IntArray): IntArray {

    val size = nums.size
    val ansArr = IntArray(size)

    for (i in 0..size-1){
        ansArr[i] = nums[nums[i]]
    }

    return ansArr
}
