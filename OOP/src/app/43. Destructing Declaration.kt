package app

import javax.security.auth.callback.Callback

/*
 ** DESTRUCTING DECLARATION: kemampuan untuk membuat multiple variables dari sebuah object
    > Cocok digunakan pada data class
    > Mengimplementasi konsep function componentX()
      componentX() disini bisa dibuat manual, bisa otomatis jika menggunakan data class
    > Dapat digunakan pada properties (multiple variables), function (multiple return), lambda (memudahkan mengakses data pada parameter)

  * Underscore pada desctructing
    > Digunakan untuk menghiraukan sebuah variabel, artinya jika diberi _ tidak akan dieksekusi
*/

//Kasus 1: Menggunakan class dan membuat componentX secara manual
class Product(val nama: String, val harga: Int) {
    operator fun component1() = nama
    operator fun component2() = harga
}

//Kasus 2: Menggunakan data class
data class ProductData(val nama: String, val harga: Int)

//Kasus 3: Multiple return dari function
data class NumberMinMax(val max: Int, val min: Int)
fun minMax(value1: Int, value2: Int) : NumberMinMax {
    return when {
        value1 > value2 -> NumberMinMax(value1, value2)
        else -> NumberMinMax(value2, value1)
    }
}

//Kasus 4: Desctructing pada lambda parameter
data class Login(val username: String, val password: String)
fun login(login: Login, callback: (Login) -> Boolean) : Boolean {
    return callback(login)
}

fun main() {
    //Result 1: Pengambilan value variable pada kasus 1
    val produk = Product("Plintengan",5_000)
    val nama = produk.component1() //Menggunakan function untuk pengambilan data
    val harga = produk.harga //Menggunakan properties untuk pengambilan data

    //Result 2: Pengambilan value variable pada kasus 2
    val produk_data = ProductData("Plintengan Super",10_000)
    val (nama_data, harga_data) = produk_data
    println("Nama = $nama_data, Harga = $harga_data")

    //Result 3: Pengambilan multiple return dari function pada kasus 3
    val (max, min) = minMax(99,1)
    println("Max = $max, Min = $min")

    //Result 4: Penggunaan underscore
    val (max_under, _) = minMax(1,10)
    println("Max = $max_under")

    //Result 5: Kasus 4 desctructing pada lambda parameter
    val request = Login("iqbra","pass")
    val success = login(request) { (username, password)
        -> username == "iqbra" && password == "pass" }
    println(success)




}