package app

/*
 ** SINGLETON OBJECT: object yang hanya dibuat 1 kali
    > Menggunakan kata kunci object
    > Sama seperti class, bisa diextend maupun interface
    > Tidak memiliki constructor
    > Biasanya digunakan untuk keperluan utilities ataupun helper
    > Properties pada singleton direkomendasikan val agar menghindari manipulasi data yang tidak disadari

  * Pembuatan: pilih opsi object ketika membuat file
*/

object Utilities {
//    val name: String = "Utilities"
    var name: String = "Utilities"
    fun toUpper(string: String): String {
        return string.uppercase()
    }
}

/*
 ** INNER OBJECT: singleton yang ada pada sebuah class
    > Memiliki konsep yang tidak saling terkait, dalam artian meskipun singleton ada pada class tetap saja singleton tidak bisa mengakses properties ataupun function dari outer class-nya

  * Pembuatan: pilih opsi object ketika membuat file
*/
class InnerObject(val name: String) {
    object Helpers {
        fun hello(name: String){ //Name di sini tidak bisa mengakses properties name class InnerObject
            println("Hello $name")
        }
    }
}

fun main() {
    val result = Utilities.toUpper("Hello Kotlin")

    println(Utilities.name)
    Utilities.name = "Utilities changed"
    println(Utilities.name)

    val second_result = InnerObject.Helpers
    println(second_result.hello("Kotlin"))

}