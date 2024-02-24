package app

import data.GenericClass

/*
 ** GENERIC CLASS: class atau interface yang memiliki parameetr type
    > Tidak ada batasan/ketentuan dalam penamaan keyword class generic, namun kebanyakan menggunakan 1 huruf
    > Kebiasaan keyword pada class generic:
      1. E = Element
      2. K = Key
      3. N = Number
      4. T = Type
      5. V = Value
      6. S,U,V = 2nd, 3rd, 4th types

*/

fun main() {
    //Pembuatan object dari class generic
    val genericData1: GenericClass<String> = GenericClass("Kotlin")
    val genericData2: GenericClass<String> = GenericClass<String>("Kotlin")
    val genericData3 = GenericClass<String>("Kotlin")
    val genericData4 = GenericClass("Kotlin")
    val genericData5 = GenericClass(10)

    genericData1.printData()
    genericData2.printData()
    genericData3.printData()
    genericData4.printData()
    genericData5.printData()
}


