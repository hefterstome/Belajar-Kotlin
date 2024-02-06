package app

/*
 ** ANY CLASS: superclass dari semua class yang ada di Kotlin
    > Ketika kita membuat class, secara tidak langsung sebenarnya class yang kita buat itu extend ke class any
    > Meskipun sebuah class memiliki parent, sebenarnya class parent itu juga akan extend ke class any
      class child --extend--> class parent --extend--> class any
      class --extend--> class any
    > Pada class any, terdaoat beberapa func bawaan yang bisa digunakan langsung ketika membuat class, yaitu:
      1. toString()
      2. equals(Any?)
      3. hasCode()
    > Untuk melihat struktur class memakai tool structures di bagian kiri
*/

class Laptop(var name: String) //Memiliki parent class any

open class HandPhone(var name: String) //Memiliki parent class any

class SmartPhone(name: String, val os: String) : HandPhone(name) //Memiliki parent class any

fun main() {
    val samsungS10 = SmartPhone("Samsung S10", "Android")
    println(samsungS10.name)
    println(samsungS10.toString()) //Tidak ada func toString di SmartPhone dan HandPhone, namun di class any ada. Ini menunjukkan bahwa class any menjadi super class
    println(samsungS10.hashCode())
}