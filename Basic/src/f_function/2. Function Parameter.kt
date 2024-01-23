package f_function

/* FUNCTION PARAMETER: function yang memiliki parameter.
   -> Ketika memanggil, diperlukan input data untuk dapat dieksekusi
    > Parameter pada sebuah function tidak terbatas
    > Parameter pada sebuah function tidaklah wajib

   ** Penulisan
   fun namaFunction(parameter: tipe data parameter) {
       kode program
   }
*/
fun sayHai(nama: String) {
    println("Hai, $nama")
}

/* NULLABLE: kondisi dimana sebuah parameter dapat bernilai null/kosong
    > Dipresentasikan dengan tanda tanya (?)
   -> Tetap harus memasukkan data ketika melakukan pemanggilan function
   -> Cara membuatnya dengan menambahkan tanda tanya (?) di akhir tipe data
*/
fun sayHaiNullable(namaAwal: String, namaAkhir: String?) {
    if (namaAkhir == null){
        println("Hai, $namaAwal")
    } else {
        println("Hai, $namaAwal $namaAkhir")
    }
}
fun main() {
    sayHai("Iqbra")
//    sayHai() //Error karena memerlukan input data ke parameter

    sayHaiNullable("Iqbra", "Kurniawan")
    sayHaiNullable("Iqbra",null)
    sayHaiNullable("Iqbra","") //Akan masuk ke blok else
//    sayHaiNullable("Iqbra") //Error


}