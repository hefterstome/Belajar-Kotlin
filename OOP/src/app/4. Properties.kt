package app

import data.Person

/*
  ** PROPERTIES: data yang bisa disisipkan pada Object
  > Properties bisa mutable (var) dan immutable (val)
  > Data yang dimiliki oleh Object harus dideklarasikan pada class-nya sebelum dapat memasukkan data ke dalam properties
  > Tidak dianjurkan membuat properties yang bisa null
  > untuk mengakses properties menggunakan tanda titik (.) setelah nama object dan diikuti nama properties
    Contoh: iqbra.firstName

  Manipulasi Properties:
  > var => bisa dimanipulasi/diubah
  > val => hanya bisa dipanggil
  > Caranya sama seperti pada manipulasi variabel
*/

fun main() {
    class Person {
        var firstName: String = ""
        var middleName: String? = null //Boleh kosong
        var lastName: String = ""
    }

    val iqbra = Person()
    iqbra.firstName = "Iqbra"
    iqbra.middleName = ""
    iqbra.lastName = "Kurniawan"

    println(iqbra.firstName)
    println(iqbra.middleName)
    println(iqbra.lastName)
}