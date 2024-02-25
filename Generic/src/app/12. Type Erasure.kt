package app

/*
 ** TYPE ERASURE: proses pengecekan generic saat compile, dan menghiraukan saat runtime
    > Type erasure akan menghapus informasi generic pada binary file
    > Hal terjadi karena pada mengadopsi Java. Dimana Java juga melakukan hal ini
      Kenapa Java melakukan ini? Untuk memastikan kompatible antar versi Java
    > Yang perlu ditekankan adalah generic itu hanya memudahkan kita untuk menulis program
      Karena pada akhirnya saat compile generic akan berubah menjadi Any
    > Hal ini bisa kita lihat saat decompile dimana generic akan diubah ke Object
    > Karena hal ini mengharuskan kita untuk bijak dalam konversi data
*/

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val typeErasure1 = TypeErasure("Kotlin")
    val dataString = typeErasure1.getData()
    println(dataString)

    //Error
    val typeErasure2 = dataString as TypeErasure<Int> //Melakukan konversi paksa dari String ke Int
    val dataInt = typeErasure2.getData()
    println(dataInt)
}