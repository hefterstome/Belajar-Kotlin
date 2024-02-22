package app

import kotlin.Number

/*
 ** OPERATOR OVERLOADING: kemampuan di Kotlin untuk mengubah function pada operator-operator yang sudah ada
    > Menggunakan kata kunci operator
    > Misal operator yang ingin diubah + dengan function plus
*/

data class Angka(val total: Int) {
//    fun plus(value: Angka): Angka { //Tanpa menambahkan kata kunci operator + tidak bisa digunakan, dapat dipakai ketika memanggil .plus
    operator fun plus(value: Angka): Angka {
        return Angka(total + value.total)
    }

    operator fun minus(value: Angka) : Angka {
        return Angka(total - value.total)
    }
}

fun main() {
    //1. Secara umum
    val angka = Angka(10) + Angka(10)

    //2. Menggunakan operator overloading
    val angka1 = Angka(10)
    val angka2 = Angka(2)
    val hasil1 = angka1 + angka2
    println(hasil1)

    val hasil2 = hasil1 - Angka(3)
    println(hasil2)
}