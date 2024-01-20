package a_Variabel

/* Nullable: variable yang memiliki value kosong.
  -> Secara standar, variable harus dideklarasikan/diberi value, namun kotlin mendukung adanya nullable. Hal ini dikarenakan kotlin bisa mengakses Java, di mana pada Java semua variabel dapat null
  -> Penggunaan ini tidak disarankan, hanya digunakan sebagai jalan terakhir jika misal mengakses kode Java
  -> Disimbolkan ? setelah tipe data
*/

fun main() {
/*  Sesuai Standar (Hasil error) */
//    val nama: String = "Iqbra Kurniawan"
//    nama = null


/*  Nullable */
   var nama: String? = "Iqbra Kurniawan"
//    println("Panjang nama = ${nama.length}") //Error dikarenakan tipe data harus sesuai
   println("Panjang nama = ${nama?.length}")

   nama = null
   println("Panjang nama = ${nama?.length}")

}
