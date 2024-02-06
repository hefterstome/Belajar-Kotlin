package app

/*
 ** Tipe data ANY: tipe data yang dapat menerima segala tipe data, sekalipun itu adalah object

 ** TYPE CHECK: kemampuan di Kotlin untuk mengecek tipe data sebuah variabel.
    > Terdapat 2 jenis, yaitu: 1. is => untuk mengecek apakah sebuah data adalah tipe data tertentu
                               2. !is => untuk mengecek apakah sebuah data adalah BUKAN tipe data tertentu

 ** CAST: kemampuan di Kotlin untuk mengkonversi sebuah data dengan tipe data tertentu ke tipe data lain
    > Cast dapat dilakukan pada: 1. Casts in IF Expression
                                 2. Casts in WHEN Expression
  * SMART CAST: mekanisme konversi otomatis ketika melakukan pengecekan bernilai true
    > Jika pengecekan menghasilkan nilai true, maka secara otomatis data yang dicek akan berubah/dikonversi ke tipe data tertentu yang dicek
  * UNSAFE CAST: mekanisme konversi tipe data dengan cara memaksa
    > Menggunakan kata kunci as
    > Sangat berisiko ketika casting terjadi pada tipe data yang tidak sesuai/sama
  * UNSAFE NULLABE CAST: mekanisme konversi tipe data dengan menerapkan value null
    > Menggunakan kata kunci as?
    > Unsafe nullable ini bisa digunakan untuk mengatasi unsafe case
    > Cara kerjanya adalah ketika terjadi kesalahan casting unsafe, maka data akan otomatis dikonversi menjadi null sehingga tidak akan terjadi error
    > Perlu diingat penggunaan null tidak disarankan pada Kotlin

*/

fun main() {
    fun printObjectAny(any: Any) { //Any membuat func printObject dapat menerima data dengan tipe data apapun ke parameter any
        println(any)
    }

    fun printObjectIFAny(any: Any) {
        if (any is Laptop) { //Jika true, any akan berubah menjadi object Laptop sehingga akan memiliki properties dan func yang dimiliki Laptop
            println("Laptop ${any.name}") //Bukti any memiliki properties dari Laptop
        } else if (any is HandPhone) {
            println("Handphone ${any.name}")
        } else {
            println(any)
        }
    }

    fun printObjectWHENAny(any: Any) {
        when (any) {
            is Laptop ->  println("Laptop ${any.name}")
            is HandPhone -> println("Handphone ${any.name}")
            else -> println(any)
        }
    }

    fun unsafeCast(any: Any) {
        val value = any as String
        println(value)
    }

    fun unsafeNullableCast(any: Any) {
//    val value = any as? String
        val value: String? = any as? String
        println(value)
    }

    println(unsafeCast("Iqbra"))
//    println(unsafeCast(1)) // Data any yang dimasukkan adalah Int, namun di func unsafeCast dipaksa cast sehingga terjadi error
                                //Akan terjadi error ClassCastException: error yang terjadi karena ketidaksamaan tipe data

    unsafeNullableCast("Iqbra")
    unsafeNullableCast(1) //Karena gagal, maka akan dikonversi ke null

    printObjectAny("Iqbra")
    printObjectAny(1)
    printObjectAny(Laptop("Asus Vivobook"))
    printObjectAny(HandPhone("Realme X10"))

    printObjectIFAny("Iqbra")
    printObjectIFAny(1)
    printObjectIFAny(Laptop("Asus Vivobook"))
    printObjectIFAny(HandPhone("Realme X10"))

    printObjectWHENAny("Iqbra")
    printObjectWHENAny(1)
    printObjectWHENAny(Laptop("Asus Vivobook"))
    printObjectWHENAny(HandPhone("Realme X10"))

}
