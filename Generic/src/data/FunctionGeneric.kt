package data

class FunctionGeneric(val name: String) {
    fun <U> inputData(data: U) = println("Hai, ${this.name}! Your data is $data")

//class Function<T>(val name: String) { //Class Function diset T
//    fun inputData(data: T) {} //T disini akan ikut T pada class Function. Jika T Function String maka akan ikut menjadi String
//}

//class Function<T>(val name: String) { //Class Function diset T
//    fun <T> inputData(data: T) {} //T disini akan override T pada class Function, sehingga tidak akan ada keterlibatan/tipe data sama
//}
}