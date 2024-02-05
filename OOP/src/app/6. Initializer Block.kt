package app

import data.Car

/*
 ** INITIALIZER BLOCK: adalah baris kode sederhana yang akan dieksekusi ketika contrsuctor dipanggil
    > Init akan berjalan ketika kita membuat object dari class yang memiliki constructor
    > Kenapa ada init? Karena dalam class, kita tidak bisa memasukkan blok kode, hanya bisa berupa properties dan function
*/

fun main() {
    class Car(brandParam: String, yearParam: Int = 2024) {
        init {
            println("Car $brandParam dibuat")
        }

        var brand: String = brandParam
        var year: Int = yearParam
    }

    val avanza = Car("Toyota")
    val almaz = Car("Wuling",2023)
    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)

    avanza.year = 2020
    println(avanza.year)
}