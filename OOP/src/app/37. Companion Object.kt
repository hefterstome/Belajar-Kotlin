package app

/*
 ** COMPANION OBJECT: kemampuan membuat sebuah singleton object tanpa menggunakan nama
    > Menggunakan kata kunci companion
    > Pembuatannya sebenarnya tidak ada nama object, namun jika diberi tetap tidak apa

  * Pemanggilan:
    1. Tanpa nama
       > namaClass.namaMemberObject
       > namaClass.companion.namaMemberObject
    2. Pakai nama
       > namaClass.namaMemberObject
       > namaClass.namaObjectCompanion.namaMemberObject

*/

class Application(val name: String) {
//    companion object Helpers {
    companion object {
        fun hello(name: String) {
            println("Hello, $name")
        }
    }
}

fun main() {
    Application.hello("Kotlin 1")
    Application.Companion.hello("Kotlin 2")

//    Application.Helpers.hello("Kotlin") //Jika pakai nama
}