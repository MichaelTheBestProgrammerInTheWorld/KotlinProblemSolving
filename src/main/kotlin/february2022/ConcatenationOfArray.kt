package february2022

fun main() {

    val intArray = intArrayOf(1, 2, 3, 4, 5)
    getConcatenation(intArray)
}

fun getConcatenation(nums: IntArray): IntArray {

    val numList = ArrayList<Int>()
    numList.addAll(nums.asList())
    numList.addAll(nums.asList())

    println(numList)

    return numList.toIntArray()
}