package february2022


fun main() {

    println(maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))))
    println(maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))))
    println(maximumWealth(arrayOf(intArrayOf(2, 8, 7), intArrayOf(7, 1, 3), intArrayOf(1, 9, 5))))
}

fun maximumWealth(accounts: Array<IntArray>): Int {

    var wealth: Int = 0
    val wealthList = ArrayList<Int>()

    for (i in accounts.indices) {
        for (j in accounts[i].indices) {
            //copy[i][j] = array[i][j]
            wealth += accounts[i][j]
        }
        wealthList.add(wealth)
        wealth = 0
    }

    return wealthList.maxOrNull() ?: 0
}