package data

class Covariant<out T>(val data: T) {
    fun getData(): T {
        return this.data
    }
}