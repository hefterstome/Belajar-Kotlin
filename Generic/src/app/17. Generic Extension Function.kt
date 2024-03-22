package app

/*
 ** GENERIC EXTENSION FUNCTION: extension function yang digunakan oleh generic parameter type
    > Generic bisa digunakan pada extension function
    > Dengan menggunakan generic extension function, kita bisa membatasi generic parameter type apa saja yang bisa menggunakan extension function yang telah dibuat
*/

class Data<T>(val data: T)

fun Data<String>.print() { //Disini generic parameter type tipe data String
    val data: String = this.data
    println("Data is $data")
}

//fun Data<Int>.print() { //Terjadi error karena kesamaan nama extension func. Hal ini terjadi dikarenakan ketika proses compile, informasi generic hilang.
fun Data<Int>.printInt() {
    val data: Int = this.data
    println("Data is $data")
}

//Ketika proses compile, informasi generic hilang sehingga akan berwujud
//fun Data<String>.print() => fun Data<Any>.print()
//fun Data<Int>.print()    => fun Data<Any>.print()
//Karena proses compile menghasilkan code yang sama sehingga sistem mendeteksi duplicate



fun main() {
    val data1 = Data(1)
    val data2 = Data("Kotlin")

//    data1.print() //Terjadi error karena data bernilai Int
    data2.print() //Bisa dilakukan karena fun extension print diset generic parameter type String

    data1.printInt()
}