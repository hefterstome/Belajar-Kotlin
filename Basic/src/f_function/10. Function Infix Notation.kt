package f_function

/* INFIX NOTATION FUNC: function yang memerlukan dua buah data untuk dieksekusi.
    > Infix notation mengadaptasi dari matematika, dimana untuk melakukan operasi matematika dibutuhkan setidaknya dua data
   -> Pemanggilannya tidak diwajibkan memakai titik
   > Contoh infix notation pada kotlin adalah range (100 downTo 1)
   -> Pembuatannya mirip dengan extension function, hanya ditambah infix

   ** Syarat
   1. Harus menjadi function member atau function extension
   2. Harus memiliki 1 parameter
   3. Parameter tidak boleh varargs
   4. Parameter tidak boleh memiliki nilai default
*/
infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    } else if (type == "LOW") {
        return this.lowercase()
    } else {
        return "Upss"
    }
}
fun main() {
    /* Pakai titik (.) seperti extension func */
    println("Iqbra Kurniawan".to("UP"))
    println("Iqbra Kurniawan".to("LOW"))
    println("Iqbra Kurniawan".to("up"))

    /* Tidak pakai titik (.) */
    println("Iqbra Kurniawan" to "LOW")
    val hasil = "Iqbra Kurniawan" to "UP"
    println(hasil)
}

