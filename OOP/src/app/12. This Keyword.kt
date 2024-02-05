package app

/*
 ** THIS KEYWORD: kata kunci yang digunakan untuk mereferensikan properties dari object sebuah class
    > This hanya bisa digunakan di dalam class itu sendiri
      Contoh: iqbra.this (salah)
    > This dapat digunakan ketika terjadi penamaan parameter yang sama => shadow
    > Sangat dianjurkan ketika mengakses properties sebuah object dalam class menggunakan this agar memudahkan membedakan dengan parameter function
*/

fun main() {
    class Person(var firstName: String = "",
                 var lastName: String = "") {
        fun sayHello(firstName: String) { //Terjadi shadow karena memiliki nama variabel yang sama dengan properties class
            //println("Hello, $firstName! My name is $firstName $lastName") //firstName akan merujuk ke parameter function sayHello
            println("Hello, $firstName! My name is ${this.firstName} ${this.lastName}")
        }
    }

    val iqbra = Person("Iqbra","Kurniawan")

    iqbra.sayHello("Kotlin")

}