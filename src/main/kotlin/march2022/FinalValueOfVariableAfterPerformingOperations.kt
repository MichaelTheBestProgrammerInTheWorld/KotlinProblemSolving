package march2022

fun main() {

    println(finalValueAfterOperations(arrayOf("--X","X++","X++")))
    println(finalValueAfterOperations(arrayOf("++X","++X","X++")))
    println(finalValueAfterOperations(arrayOf("X++","++X","--X","X--")))
}

fun finalValueAfterOperations(operations: Array<String>): Int {

    var x = 0
    for (i in operations){
        when(i){
            "X++" -> x++
            "++X" -> ++x
            "X--" -> x--
            "--X" -> --x
        }
    }
    return x
}