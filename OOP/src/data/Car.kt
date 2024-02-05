package data

class Car(brandParam: String, yearParam: Int = 2024) {

    init {
        println("Car $brandParam dibuat")
    }

    var brand: String = brandParam
    var year: Int = yearParam
}