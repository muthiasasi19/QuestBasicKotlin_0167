package com.example.questbasickotlin_0167

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World")
}

fun withParameter(name:String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("==  withNamedArgument ==")
    println("Hello, $name! Youa are $age years old.")
}

//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi

fun withDefaultParameter(name: String = "Malaika", age: Int) {
    println()
    println("==  withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int)  {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument("John", age = 30)
    withDefaultParameter(age = 25)
    withReturn(panjang = 10, lebar = 5) //
}