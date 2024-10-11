package com.example.questbasickotlin_0167

/*
List adalah kumpulan data yang disusun secara berurutan
List bersifat oredered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
List bersifat muteable dan read onlu, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
read only itu menggunakan listOf dan muteable menggunaka mutebalelisOf
*/

fun contohList() {
    println("=== List ===")

    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", " Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    //Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}