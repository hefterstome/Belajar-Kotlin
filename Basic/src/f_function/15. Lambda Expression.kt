package f_function

/* Function di Kotlin dianggap first-class citizens, artinya dianggap seperti tipe data lainnya.
   > Dalam pembuatannya function bisa berdiri sendiri tanpa membutuhkan class (konsep oop Java)
   > Bisa disimpan di variabel, array, bahkan dikirim ke parameter function itu sendiri (high-order)

   LAMBDA EXPRESSION: function yang tidak memiliki nama.
   -> Ketika menggunakan lambda, tidak harus mendeskripsikan nama functionnya
   -> Lambda expression akan mengembalikan nilai kode baris terakhir
    > Cocok digunakan untuk proses-proses sederhana/tidak rumit

   ** Pembuatan Lambda
                         ====== FUNCTION ======    ==== LAMBDA ====
      val/var namaLambda: (tipe) -> tipe return = { parameter: tipe ->
         kode program
      }
      val contohLambda: (String) -> String = {value: String ->
         val result = "$value"
         result
      }

*/
fun main() {
    /* CONTOH LAMBDA */
    val namaLengkapLambda: (String, String) -> String = {namaAwal: String, namaAkhir: String ->
        "$namaAwal $namaAkhir"
//        val result = "$namaAwal $namaAkhir"
//        result
    }
    val hasil = namaLengkapLambda("Iqbra", "Kurniawan")
    println(hasil)
    println(namaLengkapLambda("Iqbra", "Kurniawan"))

    /* IT: kata kunci yang digunakan untuk merepresentasikan parameter lambda apabila hanya 1.
       -> Hanya bisa digunakan ketika parameter 1
       -> Jika parameter dinamai, tidak bisa digunakan
     */
    val itLambda: (String) -> String = {
        "it = $it"
    }
    val upperItLambda: (String) -> String = {
        it.uppercase()
    }
    println(itLambda("Kotlin"))
    println(upperItLambda("Kotlin"))

    /* METHOD REFERENCES: lambda yang mereferensi function yang sudah ada
        > Ada function, kemudian membuat lambda untuk function tersebut
       -> Pada body lambda cukup menggunakan ::namaFunction
    */
    fun toUpperFunc(value: String): String = value.uppercase()
    val toUpperLambda: (String) -> String = ::toUpperFunc
    println(toUpperLambda("Belajar Kotlin Masszeeeh"))
}
