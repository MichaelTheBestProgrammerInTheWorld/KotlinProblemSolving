package february2022

fun main() {

    println(shuffle(intArrayOf(2,5,1,3,4,7), 3).asList())
    println(shuffle(intArrayOf(1,2,3,4,4,3,2,1), 4).asList())
    println(shuffle(intArrayOf(1,1,2,2), 2).asList())
}

fun shuffle(nums: IntArray, n: Int): IntArray {

    val xArr = IntArray(n)
    val yArr = IntArray(n)
    val shuffleArr = IntArray(nums.size)
    var index = 0

    for (i in 0..n-1){
        xArr[i] = nums[i]
    }

    for (i in n..nums.size-1){
        yArr[i-n] = nums[i]
    }

    for (i in 0..n-1){
        shuffleArr[index] = xArr[i]
        shuffleArr[index+1] = yArr[i]
        index += 2
    }

    return shuffleArr
}