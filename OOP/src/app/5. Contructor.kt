package app

import data.Car

/*
 ** CONSTRUCTOR: mirip function, di mana akan dipanggil ketika membuat sebuah Object
 > Jika membuat class dengan constructor, maka constructor tersebut akan dieksekusi/dipanggil ketika membuat object dari class tersebut
 > Memiliki ciri yang sama dengan function, dapat memiliki parameter
 > Ketika ada parameter contructor tanpa default maka diperlukan memasukkan data ketika membuat object
 > Umumnya, kalau memakai contructor tidak perlu memakai properties lagi karena data akan langsung dimasukkan ketika membuat object
 > Contructor tidak memiliki default returun
 > Ketika memakai constructor, paramater constructor dapat digunakan untuk nilai default properties
*/

fun main() {
    class Car(brandParam: String, yearParam: Int = 2024) {
        var brand: String = brandParam
        var year: Int = yearParam
    }

    /* Pembuatan Object dengan Class Constructor */
    val avanza = Car("Toyota")
    val almaz = Car("Wuling",2023) //Manipulasi data dapat langsung dilakukan ketika memakai constructor
    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)

    avanza.year = 2020 //Tetap dapat dimanipulasi meskipun menggunakan constructor
    println(avanza.year)
    /* Jika tidak menggunakan contructor, maka manipulasi lewat properties */
}


