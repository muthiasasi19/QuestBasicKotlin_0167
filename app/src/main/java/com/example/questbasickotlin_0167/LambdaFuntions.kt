package com.example.questbasickotlin_0167

// Lambda funtions adalah fungsi yang tidak memiliki nama. Biasanya digunakan untuk membuat fungsi yang sederhana.
// Menggunakan tanda panah  (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}

// Dapat ditulis dalam ekspresi lambda sbb:
fun main() {
    uppercaseString("Hello")
    println({ string: String -> string.uppercase()}("hello"))
    //Hello
}