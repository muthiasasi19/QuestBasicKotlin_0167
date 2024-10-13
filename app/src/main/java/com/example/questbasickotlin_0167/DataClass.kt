package com.example.questbasickotlin_0167

import android.adservices.adid.AdId
import android.provider.ContactsContract.CommonDataKinds.Email

/*
Data Class adalah class yang digunakan untuk menyimpan data.
menyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString().
Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan
*/

data class DataClass(
    val id: Int,
     var email: String
)

fun main() {
    val data = DataClass(1, "muthia@gmail.com")
    println(data)

}