package app

/*
 ** LAZY PROPERTIES: standar library di Kotlin agar sebuah properties diinisiasi ketika properties tersebut diakses
    > Lazy di sini berbentuk class bawaan
    > Untuk menggunakannya dengan kata kunci by lazy
    > Jika tidak dipanggil, maka tidak akan dieksekusi

  * Kebalikan dari lazy adalah iger
    > Iger bersifat akan langsung dieksekusi
      Contoh val name: String = "Iqbra"
*/

fun main() {
    class Account {
        val name: String by lazy { //Lazy di sini berbentuk lambda, sehingga pada scope berikut bebas melakukan program apapun
            println("Lazy called")
            "Iqbra" //Data di akhir ini harus sesuai dengan tipe data pada properties name
        }
    }

    val akun = Account()
    akun.name //Akan membuat inisiasi properties menggunakan lazy
    println(akun.name)
}