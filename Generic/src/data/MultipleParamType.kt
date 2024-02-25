package data

class MultipleParamType<T, U>(private val firstData: T, private val secondData: U) {
    fun getFirstData(): T {
        return this.firstData
    }

    fun getSecondData(): U {
        return this.secondData
    }

    fun printData() = println("Data is ${this.firstData} and ${this.secondData}")
}