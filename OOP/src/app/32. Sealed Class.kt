package app

/*
 ** SEALED CLASS: class yang tidak bisa dibuat object dan hanya bisa diturunkan
    > Menggunakan kata kunci sealed
    > Default sealed class adalah abstract
    > Cocok digunakan untuk class parent
    > Sangat berfungsi ketika menggunakan when expression
      Dengan WHEN EXP akan membatasi class turunannya saja yang akan dicek
      Hal ini dikarenakan when exp akan bisa mengidentifikasi sub class dari sealed sehingga apabila kurang menambahkan sub class pada when akan terjadi error
*/

sealed class Operation(val name: String)

class Plus : Operation("Plus")
class Minus: Operation("Minus")
class Modulo: Operation("Modulo")

fun main() {
    fun operation(value1: Int, value2: Int, operation: Operation): Int {
        return when(operation) { //Jika kurang menuliskan sub class, akan langsung teridentifikasi
            is Plus -> value1 + value2
            is Minus -> value1 - value2
            is Modulo -> value1 % value2
        }
    }

    println(operation(10,8,Minus()))
    println(operation(3,4,Plus()))
    println(operation(286393,28,Modulo()))
}