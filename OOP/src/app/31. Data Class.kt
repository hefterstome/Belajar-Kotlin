package app

/*
 ** DATA CLASS: class yang hanya digunakan untuk represntasi data
    > Menggunakan kata kunci data
    > Sangat cocok digunakan untuk membuat class dari tabel database
    > Semua properties pada data class harus ditambah/dibuat pada primary cons
    > Perbedaan dengan class adalah pada data class, primary cons akan diistimewakan
      Contohnya akan secara otomatis dibuatkan func toString(), hashCode(), dan equals() sesuai properties dari primary cons
      Cek di decompile
    > Pada data class, manipulasi properties dan function tetap bisa dilakukan pada body scope

  * COPY DATA CLASS: function untuk melakukan duplicate pada object dari data class
    > Menggunakan kata kunci .copy()
    > Dapat dilakukan manipulasi secara langsung pada parameter function copy menggunakan named augment
*/
fun main() {
//    class Product(var name: String,
    data class Product(var name: String,
                  var price: Int,
                  val category: String)

    val teh = Product("Teh 999",2_000,"Minuman")
    println(teh)

    val tehCopy = teh.copy()
    println(tehCopy)
    val tehCopy2 = tehCopy.copy(price = 3_000)
    println(tehCopy2)
}