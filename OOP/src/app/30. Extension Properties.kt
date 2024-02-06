package app

/*
 ** EXTENSION PROPERTIES: propertis tambahan yang bisa ditambah ke sebuah object
    > Konsepnya mirip seperti extension func
    > Untuk membuatnya bisa menggunakan properties setter dan getter
*/

val Student.upperName: String
    get() = this.name.uppercase()

fun main() {
    val siswa: Student? = Student("Iqbra",16)
    println(siswa?.upperName)
}