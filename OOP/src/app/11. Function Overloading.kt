package app

/*
 ** FUNC OVERLOADING: function yang memiliki nama sama di dalam sebuah class

  * Syarat:
    1. Memiliki jumlah parameter yang berbeda
                        ATAU
    2. Memiliki tipe parameter yang berbeda
                        DAN
    3. Memiliki tipe data return yang sama
*/

fun main() {
    class Person(var firstName: String = "",
                 var middleName: String? = null,
                 var lastName: String = "") {
        fun sayHello(nameParam: String) {
            println("Hello, $nameParam! I'm $firstName")
            println("Say Hello Function 1")
        }
        //fun sayHello(nameParam: String) { //Error karena parameter sama
        //fun sayHello(nameParam: String): String { //Error, karena memiliki tipe return yang berbeda
        fun sayHello(firstNameParam: String, lastNameParam: String) {
            println("Hello, $firstNameParam $lastNameParam! I'm $firstName")
            println("Say Hello Function 2")
        }
        fun sayHello(nameParam: Int) {
            println("Hello, $nameParam! I'm $firstName")
            println("Say Hello Function 3")
        }
    }

    val iqbra = Person("Iqbra")
    iqbra.lastName = "Kurniawan"

    iqbra.sayHello("Hans")
    iqbra.sayHello(2024)
    iqbra.sayHello("Hans", "Landa")

}