package app

import data.Car
import data.Person

fun main() {
    /* Membuat object */
    val iqbra = Person()
    println(iqbra) //Akan muncul lokasi penyimpanan pada memori
    val landa = Person()
    val lecter = Person()

    /* Manipulasi properties: merubah value properties
       -> Bisa dirubah ketika var, jika memiliki val akan terjadi error
       -> Caranya sama seperti pada variabel, nama object diikuti tanda titik (.) sebelum nama properties
          namaObject.namaProperties = value
    */
    iqbra.firstName = "Iqbra"
    println(iqbra.firstName)

}