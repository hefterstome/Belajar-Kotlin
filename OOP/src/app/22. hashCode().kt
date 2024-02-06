package app

/*
 ** hashCode(): function yang merepresentasikan number pada sebuah object
    > Sangat berguna ketika ingin me-konversi object ke angka
    > Hasil hashCode berbentuk kode unik seperti alamat penyimpanan
    > Kita bisa me-override func hashCode pada sebuah object
    > Sangat banyak dibutuhkan ketika di struktur data
      Contoh dalam array ingin memasukkan data yang tidak boleh duplicate, bisa menggunakan cara dicek dulu nilai hashCode()-nya, jika hashCode sama maka dianggap object yang sama.
*/
fun main() {
    class Customer(var name: String) {
        override fun hashCode(): Int {
            return name.hashCode()
        }
    }

    val customer1 = Customer("Iqbra")
    val customer2 = Customer("Iqbra")

    println(customer1)
    println(customer2)
    println(customer1.hashCode() == customer2.hashCode())
}