package app

/*
 ** STAR PROJECTION: generic type yang digunakan ketika tidak mempedulikan generic parameter type
    > Menggunakan kata kunci bitang (*)
    > Misal kita ingin mengambil panjang Array<T>, dimana generic typenya tidak ada kaitannya karena hanya ingin mengetahui panjangnya saja. Maka kita bisa menggunakan star projection
    > Ketika menggunakan star projection, kita dapat mengirim/memasukkan tipe data apapun
*/

fun displayLength(array: Array<*>) {
    println("Array lenght = ${array.size}")
}
fun main() {
    //Array termasuk generic type
    val arrayInt: Array<Int> = arrayOf(1,2,3,4,5)
    val arrayString = arrayOf("Kotlin", "Java", "Python")
    displayLength(arrayInt)
    displayLength(arrayString)
}

