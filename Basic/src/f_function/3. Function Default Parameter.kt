package f_function

/* FUNC DEFAULT PARAMETER: function yang memiliki parameter bernilai default.
   -> Jika parameter memiliki default value, tidak diwajibkan input data ketika memanggil function.
    > Cocok digunakan pada parameter yang sekiranya tidak wajib diisi

    ** Penulisan
    fun namaFunction (parameter: tipe data parameter = default value) {
        kode program
    }
*/
fun namaDefaultFunc(namaAwal: String, namaAkhir: String? = null) {
    if (namaAkhir == null){
        println("Hai, $namaAwal")
    } else {
        println("Hai, $namaAwal $namaAkhir")
    }
}
fun main() {
    namaDefaultFunc("Iqbra")
    namaDefaultFunc("Iqbra", "Kurniawan")
}