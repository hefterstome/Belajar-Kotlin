package app

/*
 ** VISIBILITY MODIFIERS: pembatasan hak akses di Kotlin
    > Class, interface, constructor, functions, dan properties (termasuk setter dan getter)
    > Secara default adalah public
    > Jenis:
      1. Public: dapat diakses dari manapun
      2. Private: hanya diakses pada tempat/scope deklarasinya
      3. Protected: hanya bisa diakses pada tempat/scope deklarasinya dan turunannya
      4. Internal: hanya bisa diakses dalam 1 project/package
         Biasanya digunakan saat distribusi projek/kode
*/

fun main() {
    open class Profesi(private val name: String) {
        open protected fun printName(name: String) {
            println("Nama $name = ${this.name}")
        }
    }

    class Guru(name: String) : Profesi(name) {

    }

    val guru1 = Guru("Hannibal")
//    guru1.printName()
//    println(guru1.name)
}