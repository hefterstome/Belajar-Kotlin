package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/*
 ** OBSERVABLE PROPERTY: class generic yang digunakan untuk memudahkan dalam penggunaan ReadOnly dan ReadWrite
    > Perbedaannya, ReadOnly dan ReadWrite harus maintain datanya secara manual. Sedangkan dengan observable data akan dimaintain otomatis oleh Kotlin
    > Terdapat fun beforeChange dan afterChange

  * Object Delegates
    > Terkadang kita hanya ingin menggunakan before atau after saja, untuk itu kita bisa menggunakan object delegates
      1. Delegates.notNull()
         -> Untuk mengecek apakah property bernilai null. Jika ya akan error
      2. Delegates.vetoable(value, beforeChange)
         -> Untuk observable beforeChange
         -> Param beforeChange disini adalah lambda
      3. Delegates.observable(value, afterChange)
         -> Untuk observable afterChange
         -> Param afterChange disini adalah lambda
*/

class LogObservableProperty<T>(data: T) : ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change value from $oldValue to $newValue")
        return true //Diperlukan return karena fun beforeChange mengembalikan nilai boolean
    }
    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change value from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)

    var owner: String by Delegates.notNull<String>()
    var description: String by Delegates.vetoable(""){ property, oldValue, newValue ->
        println("Before change value from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable(""){ property, oldValue, newValue ->
        println("After change value from $oldValue to $newValue")
    }
}

fun main() {
    var car = Car("Toyota", 2023)
    /* Kasus 1: Nothing happen */
//    println(car.brand)
//    println(car.year)

    /* Kasus 2: Jika value properti diubah akan eksekusi fun before dan after  */
    car.brand = "Wuling"
    println(car.brand)
    car.year = 2024
    println(car.year)

    /* Kasus 3: Properti owner belum diset sehingga masih bernilai null dan mengakibatkan error */
//    println(car.owner)

    /* Kasus 4: Properti owner diset */
    car.owner = "Iqbra"
    println(car.owner)

    /* Kasus 5: Penggunaan Delegates.vetoable */
    car.description = "New product"
    println(car.description)

    /* Kasus 6: Penggunaan Delegates.observable */
    car.other = "Cmon dude, this product is fucking great!!"
    println(car.other)
}