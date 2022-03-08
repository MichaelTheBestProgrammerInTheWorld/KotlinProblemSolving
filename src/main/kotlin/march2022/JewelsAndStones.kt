package march2022

fun main() {

    println(numJewelsInStones("aA", "aAAbbbb"))
    println(numJewelsInStones("z", "ZZ"))
}

fun numJewelsInStones(jewels: String, stones: String): Int {

    var numOfJewels = 0
    stones.toCharArray()
    jewels.toCharArray()
    for (j in stones){
        if (jewels.contains(j)){
            numOfJewels++
        }
    }
    return numOfJewels
}