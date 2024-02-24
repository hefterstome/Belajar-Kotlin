package app

import data.FunctionGeneric

/*
 ** FUNCTION GENERIC: function yang memeiliki parameter berupa parameter type
    > Parameter yang ada hanya bisa digunakan pada scope function itu saja, tidak bisa digunakan di luar func tersebut
    > Diusahakan membuat parameter type berbeda keyword agar tidak membingungkan
*/

fun main() {
    val myData = FunctionGeneric("Kotlin")
    myData.inputData(10)
    myData.inputData("Hello World")
}