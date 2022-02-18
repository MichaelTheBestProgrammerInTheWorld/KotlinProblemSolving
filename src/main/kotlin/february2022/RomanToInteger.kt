package february2022

import java.lang.StringBuilder

fun main() {

    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))

    println(romanToInt("II"))
    println(romanToInt("XII"))
    println(romanToInt("XXVII"))

    println("complex numbers")

    println(romanToInt("IVIXXLXCCDCM"))

}

fun romanToInt(s: String): Int {

    var numeric = 0;
    val charArray: CharArray = s.toCharArray()
    val REPLACEMENT = 'A'

    val romanMap = HashMap<Char, Int>()
    romanMap.put('I', 1)
    romanMap.put('V', 5)
    romanMap.put('X', 10)
    romanMap.put('L', 50)
    romanMap.put('C', 100)
    romanMap.put('D', 500)
    romanMap.put('M', 1000)

    val subtractMap = HashMap<String, Int>()
    subtractMap.put("IV", 4)
    subtractMap.put("IX", 9)
    subtractMap.put("XL", 40)
    subtractMap.put("XC", 90)
    subtractMap.put("CD", 400)
    subtractMap.put("CM", 900)

    for (i in 1..charArray.size-1){
        val subStr = StringBuilder()
        subStr.append(charArray[i-1])
        subStr.append(s[i])
        if (subtractMap.containsKey(subStr.toString())){
            numeric += subtractMap.get(subStr.toString())!!
//            s.replace(s[i-1], REPLACEMENT)
//            s.replace(s[i], REPLACEMENT)
            charArray[i-1] = REPLACEMENT
            charArray[i] = REPLACEMENT
        }
    }
    for (i in 0..charArray.size-1){
        if (charArray[i].equals(REPLACEMENT)){
            continue
        }
        numeric += romanMap.get(charArray[i])!!
    }

    return numeric
}