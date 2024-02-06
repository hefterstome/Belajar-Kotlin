package app

/*
 ** EQUALS: function bawaan any yang digunakan untuk merepresentasikan perbandingan dua buah data
    > Perbandingan equals ada: 1. Sama dengan --> ==
                               2. Tidak sama dengan --> !=
    > Sebenarnya ketika kita menggunakan operator (==) dan (!=), secara tidak langsung kita memanggil func equals
    > Kita dapat melakukan overriding pada func equals sesuai kebutuhan kita
    > Secara default, equals bekerja membandingkan objek dengan melihat address penyimpanan/kode unik sebuah object
*/

fun main() {
    class Customer(var nama: String) {
        //Dengan class bawaan/tanpa overriding equals akan membandingkan object

        /* Override berikut untuk mengubah equals membandingkan berdasarkan value bukan lagi object */
        override fun equals(other: Any?): Boolean {
            return when (other) {
                is Customer -> this.nama == other.nama
                else -> false
            }
        }

        override fun hashCode(): Int {
            return nama.hashCode()
        }
    }

    val customer1 = Customer("Iqbra")
    val customer2 = Customer("Iqbra")
    println(customer2 == customer1) //Tanpa overriding akan dibandingkan berdasarkan object
    println(customer2 == customer2)
}
