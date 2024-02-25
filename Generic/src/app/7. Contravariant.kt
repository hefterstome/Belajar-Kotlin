package app

import data.Contravariant

/*
 ** CONTRAVARIANT: kemampuan untuk subtitusi object parent ke child
    > Kebalikan dari covariant
    > Menggunakan kata kunci in
    > Harus memiliki parameter yang merujuk ke parameter type di class
      Tidak boleh memiliki return value yang merujuk ke parameter type di class
*/

fun main() {
    val contravariantAny = Contravariant<Any>()
    contravariantAny.printData(10)

    val contravariantString: Contravariant<String> = contravariantAny
    contravariantAny.printData("Kotlin")
}