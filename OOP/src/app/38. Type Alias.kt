package app

/*
 ** TYPE ALIAS: kemampuan untuk membuat nama berbeda dari sebuah tipe data yang sudah ada
    > Menggunakan kata kunci typealias
    > Mirip seperti as pada python
    > Dapat digunakan pada object typealias lainnya
    > Dapat digunakan pada function
    > Biasa digunakan untuk mempersingkat tipe data yang memiliki nama panjang atau memiliki nama sama sehingga mungkin membingungkan proses package
*/

class AplikasiClassContohPanjangYa(val name: String) {
    fun printName() {
        println("${this.name}")
    }
}

typealias aplikasi = AplikasiClassContohPanjangYa
typealias ap = aplikasi //ap akan membuat alias dari aplikasi, aplikasi akan membuat alias dari AplikasiClassContohPanjangYa

/* TYPE ALIAS pada FUNCTION
   > Biasa digunakan pada lambda atau function yang memiliki parameter func
*/

typealias StringName = () -> String
//fun tanyaKabar(name: () -> String) { //Func param tanpa type alias, hal ini bisa saja menyulitkan apabila func param tersebut memiliki body yang panjang
fun tanyaKabar(name: StringName) {
    println("Yooo ${name()}! How are your fucked up today?")
}

fun main() {
    val apk = aplikasi("Kotlin")
    val app = ap("Python")

    tanyaKabar { "Human" }
}