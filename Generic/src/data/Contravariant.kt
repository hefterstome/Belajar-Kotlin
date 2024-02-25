package data

class Contravariant<in T> {
//    fun printData(param: T): T { //Tidak bisa return value merujuk ke parameter type T
    fun printData(param: T) {
        println("Data is $param")
    }
}