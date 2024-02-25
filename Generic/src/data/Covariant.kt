package data

class Covariant<out T>(private val data: T) {
//    fun getData(param: T): T { //Tidak boleh memiliki parameter dari T
    fun getData(): T {
        return this.data
    }
}