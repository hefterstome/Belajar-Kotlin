package app

/*
 ** ANNOTATION: kemampuan untuk menambahkan metadata/informasi tambahan pada sebuah object
    > Menggunakan kata kunci annotation
    > Biasa dan sangat cocok digunakan ketika membuat library atau framework. Jika tidak akan terasa sia-sia
    > Hanya bisa memiliki properties pada primary cons, tidak bisa memiliki properties dan function pada body

  * Attribute
    1. @Target --> Memberitahu annotation bisa digunakan di mana? Class, function, properties, dan lain-lain
    2. @Retention --> Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection?
    3. @Repeatable --> Memberitahu annotation apakah bisa digunakan lebih dari sekali di target yang sama?
    4. @MustBeDocumented --> Memberitahu annotation apakah perlu didokumentasikan di public API
*/

// Membuat Annotation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class MyLibary(val author: String) {
//    val name: String //Error karena tidak bisa memiliki member pada body class annotation
}

// Menggunakan Annotation Class
@MyLibary("Iqbra")
class MyApplication(val name: String, val version: Int) {
    fun printInfo() = println("App: $name, Versi: $version")
}

fun main() {
    val result = MyApplication("Oreki",8)
    result.printInfo()
}

