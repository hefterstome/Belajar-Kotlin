package app

/*
 ** NULL SAFETY: cara-cara yang digunakan untuk menanggulangi NullPointerExcemption (error yang disebabkan karena adanya nilai null yang diakses)
*/

data class Nama(val name: String)

//1. Menggunakan safe call (tanda tanya ?) => direkomendasikan
fun helloName(nama: Nama?) {
    println("Hello ${nama?.name}")
}

//2. Menggunakan pengecekan manual IF
fun haiName(nama: Nama?) {
    if (nama != null) {
        println("Hai ${nama?.name}")
    }
}

//3. Menggunakan elvis operator
fun yoName(nama: Nama?) {
    val result = nama?.name ?: "My Friend"
    println("Yoo, $result")
}

//4. Menggunakan !! operator
//   > !! Operator digunakan untuk menyakinkan Kotlin bahwa data tersebut tidak null, namun jika bernilai null akan tetap menghasilkan error
fun howName(nama: Nama?){
    println("How ${nama!!.name}")
}

fun main() {
    helloName(Nama("Iqbra"))
    helloName(null)

    haiName(Nama("Iqbra"))
    haiName(null)

    yoName(Nama("Iqbra"))
    yoName(null)

    howName(Nama("Iqbra"))
//    howName(null) //Error

}