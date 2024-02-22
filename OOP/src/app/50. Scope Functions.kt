package app

/*
 ** SCOPE FUNCTIONS: function standar library Kotlin yang digunakan untuk mengeksekusi object dengan mudah memanfaatkan lambda exp
    > Biasa digunakan sebagai references block agar lebih mudah dalam manipulasi data
    > Pada pemilihan jenisnya disesuaikan
    > Berbentuk extension function

  * * Jenis:
    1. let --> it
       > Memiliki parameter object itu sendiri, sehingga menggunakan it untuk mendapatkan referensi object tersebut
    2. run --> this
       > Mirip dengan let
       > Tidak ada parameter lambdanya, sehingga untuk mengakses referensi datanya menggunakan kata kunci this
    3. apply --> this
       > Mirip dengan run
       > Return value referensi objectnya adalah object itu sendiri
    4. also --> it
       > Mirip dengan let
       > Return value referensi objectnya adalah object itu sendiri
    5. with --> this
       > Bukan extension func sehingga tidak bisa dipanggil secara langsung pada objectnya (.)
       > Harus dipanggil secara manual
*/
class Mahasiswa(val name: String, val age: Int)
fun main() {
    val mahasiswa = Mahasiswa("Iqbra",15)

    //1. Menggunakan cara umum
    val nama = mahasiswa.name
    println(nama)

    //2. Menggunakan let - tanpa disimpan
    mahasiswa.let {
        println(it.name)
        println(it.age)
    }

    //3. Menggunakan let - disimpan
    val resultLet = mahasiswa.let {
        "Nama: ${it.name}, umur ${it.age}"
    }
    println(resultLet)

    //4. Menggunakan run
    val resultRun = mahasiswa.run {
        "Nama: ${this.name}, umur ${this.age}"
    }
    println(resultRun)

    //5. Menggunakan apply
    val resultApply: Mahasiswa = mahasiswa.apply {
        "Nama: ${this.name}, umur ${this.age}"
    }
    println(resultApply)

    //6. Menggunakan also
    val resultAlso: Mahasiswa = mahasiswa.also {
        "Nama: ${it.name}, umur ${it.age}"
    }
    println(resultAlso)

    //7. Menggunakan with
    val resultWith = with(mahasiswa) {
        "Nama: ${this.name}, umur ${this.age}"
    }
    println(resultWith)

}
