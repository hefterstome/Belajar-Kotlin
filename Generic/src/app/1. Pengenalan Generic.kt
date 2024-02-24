package app

/*
 ** GENERIC: kemampuan menambahkan parameter type saat membuat function ataupun class
    > Tujuannya adalah untuk memudahkan kita mengubah tipe dengan mudah

  * Parameter type dan parameter berbda

  * Keunggulan:
    1. Pengecekan terjadi saat proses kompilasi
       Pada Kotlin generic, proses pengecekan terjadi saat kompilasi. Hal ini akan menyebabkan program akan langsung otomatis mengetahui error sebelum proses execute
       Sedangkan pada kotlin non generic, pengecekan terjadi saat proses runtime. Hal ini akan menyebabkan program berhenti apabila terjadi error dan tidak diketahui error ketika proses kompilasi
    2. Memudahkan dalam pengecekan dan konversi data
       Pada kotlin generic, dapat melakukan konversi data dengan mudah.
    3. Memudahkan programmer dalam membuat program generic yang bisa digunakan berbagai tipe data

  * Pembuatan:
    > Menggunakan kata kunci diamond: <T>, <String>

*/

// Kode non generic
class NonGeneric(val value: Any)

//Kode generic
class Generic<T>(val value: T) //T disini tidak tetap, bisa diubah huruf lain. Namun yang sering digunakan adalah T

fun main() {
    //Result non generic
    val data1 = NonGeneric("Kotlin")
    val dataString: String = data1.value as String //Diperlukan konversi manual dan harus sesuai

    val data2 = NonGeneric(10)
    val dataInt: Int = data2.value as Int

    //Result generic
    val data3 = Generic<String>("Kotlin")
    val dataGeneric1 = data3.value //Tidak perlu melakukan konversi manual

    val data4 = Generic<Boolean>(true)
    val dataGeneric2 = data4.value

}