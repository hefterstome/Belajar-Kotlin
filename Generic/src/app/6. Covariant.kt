package app

import data.Covariant

/*
 ** COVARIANT: artinya kita bisa mensubtitusi object parent dan class
    > Menggunakan kata kunci out
    > Tidak semua class generic bisa menerapkan covariant, hanya class generic yang memiliki function generic parameter type dengan return type function
*/

fun main() {
    val covariant = Covariant<String>("10")
    println(covariant.getData())
    val covariantChanged: Covariant<Any> = covariant
}