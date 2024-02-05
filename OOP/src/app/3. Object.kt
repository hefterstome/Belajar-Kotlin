package app

import data.Person //Import package class Person

/*
 ** OBJECT: data yang memiliki properties/attributes/fields dan functions/methods/behaviors.
    > Dianjurkan memakai huruf kecil

    Pembuatan object:
    1. Memanggil nama class
     var/val namaObject = namaClass()
     val iqbra = Person()
*/

fun main() {
    class Person {

    }

    /* Membuat Object dari Class */
    val iqbra = Person()
    val landa = Person()

    println(iqbra) //Hasil akan menampilkan address penyimpanan dari Object
    println(landa)

}