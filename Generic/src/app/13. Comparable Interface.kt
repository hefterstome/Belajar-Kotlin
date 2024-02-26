package app

/*
 ** COMPARABLE INTERFACE: interface bawaan yang digunakan untuk komparasi pada Kotlin
    > Pada comparable interface menggunakan generic type
    > Operator komparasi: >, <, <=, >=
      == dan != menggunkan equals
*/

import data.ComparableInterface

fun main() {
    val compare1 = ComparableInterface("Buku",10)
    val compare2 = ComparableInterface("Pasir",10)

    println(compare1 > compare2)
    println(compare1 >= compare2)
    println(compare1 < compare2)
    println(compare1 <= compare2)
}