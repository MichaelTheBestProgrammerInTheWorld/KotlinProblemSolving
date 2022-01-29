package february2022

/*
A jail has a number of prisoners and a number of treats to pass out to
them. Their jailer decides the fairest way to divide the treats is to
seat the prisoners around a circular table in sequentially numbered
chairs. A chair number will be drawn from a hat. Beginning with the
prisoner in that chair, one candy will be handed to each prisoner
sequentially around the table until all have been distributed.

The jailer is playing a little joke, though. The last piece of candy
looks like all the others, but it tastes awful. Determine the chair
number occupied by the prisoner who will receive that candy.
 */

//solved, failed

fun main() {

    println(saveThePrisoner(4, 6, 2))
    println(saveThePrisoner(5, 2, 1))
    println(saveThePrisoner(5, 2, 2))
    println(saveThePrisoner(7, 19,2))
    println(saveThePrisoner(3, 7, 3))
}

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    // Write your code here
//    var lastPrisoner = s
//    var lastCandy = m-1
//    while (lastCandy > 1){
//        if (lastPrisoner > n){
//            lastPrisoner = 1
//        } else {
////            if (lastCandy != m){
////                lastPrisoner++
////            }
//
//        }
//        lastCandy--
//    }
//    for (i in 1..m){
//        if (lastPrisoner > n){
//            lastPrisoner = 1
//        } else {
//            lastPrisoner++
//        }
//    }

    return ((m - 1) + (s - 1)) % n + 1;
}



