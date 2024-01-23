package f_function

/* EXTENSION FUNCTION: function yang dibuat untuk bisa ditambahkan ke function tipe data yang sudah ada
    > Harap bijak menggunakannya karena jika terlalu banyak akan menyulitkan dalam pemahaman kode program
   -> Untuk membuatnya dengan memberi tanda titik (.) setelah tipe data dan diikuti nama functionnya.
   -> Untuk mengakses data pada extension function dapat menggunakan kata kunci this
   -> Untuk pemanggilannya dengan memberi .namaFunction setelah variable
*/
fun String.hello(): String {
    return "Hello $this"
}
fun Int.pangkatTiga(): Int {
    return this*this*this
}
fun Double.kali(n: Double): Double {
    return this*n
}
fun main() {
    val nama = "Iqbra"
//    val hasil = nama.hello()
    println(nama.hello())
    println("World".hello())

    println(2.pangkatTiga())

    println(2.0.kali(9.0))
}