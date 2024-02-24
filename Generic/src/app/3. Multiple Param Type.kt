package app

import data.MyDataMultipleParam

/*
 ** MULTIPLE TYPE PARAM: class generic yang memiliki lebh dari 1 parameter type
    > Jumlah parameter type pada class generic tidak terbatas
    > Untuk membuat lebih dari 1 harus berbeda nama
*/

fun main() {
    val myData = MyDataMultipleParam("Kotlin", 10) //Kotlin secara otomatis tetap dapat mendeteksi value tipe data yang dimasukkan
    myData.printData()
}