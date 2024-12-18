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

/*
Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya memnyimpan data unik (tidak ada duplikasi)
Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
set yang bersifat  mutebale dan readonly, artinya data yang dimasukkan dapat diubah dan tidak dapt diubah
set read only menggunalan setOf dan set muteable menggunakan setmuteableOf
*/

fun ContohSet() {
    println()
    println("=== Set ===")

    // Set Read-Onlu
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", " Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam set mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

    //set Read-Only
    val shapesLocked: Set<String> =shape
    println(shapesLocked)
}

/*
Map adalah kumpulan data yang disusun dalam pasangan key-value
Map bersifat unoreder, artinya data yang dimasukkan tidak memiliki posisi tertentu
Map bersifat readonlu (mapOf) dan muteable (muteableMapOf)
*/

fun ContohMap() {
    println()
    println("=== Map ===")

    // Map Read-Onlu
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    //Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    //map Read-Only
    val shapesLocked: Map<String, Int> =shape
    println(shapesLocked)
}

fun main() {
    contohList()
    ContohSet()
    ContohMap()
}

