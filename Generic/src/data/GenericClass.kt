package data

class GenericClass<T>(private val firstData: T) {
    fun getData(): T {
        return this.firstData
    }

    fun printData() = println("Data is ${this.firstData}")
}