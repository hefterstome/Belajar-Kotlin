package app

/*
  * Function pada Class
    > Untuk membuatnya menggunakan kata kunci fun
    > Cara memanggilnya sama dengan memanggil properties, namaObject titik(.) namaFunction
    > Function dalam sebuah class bisa mengakses properties dalam class yang sama
*/
fun main() {
    class Person(var firstName: String = "",
                 var middleName: String? = null,
                 var lastName: String = "") {
        fun sayHello(nameParam: String) {
            println("Hello, $nameParam! I'm $firstName")
        }

        fun run() {
            println("Program running!")
        }

        fun getFullName(): String {
            return if (middleName == null) {
                "$firstName $lastName"
            } else {
                "$firstName $middleName $lastName"
            }
        }

    }

    val iqbra = Person()
    iqbra.firstName = "Iqbra"
    iqbra.lastName = "Kurniawan"

    iqbra.sayHello("Kotlin")
    iqbra.run()
    println(iqbra.getFullName())
}