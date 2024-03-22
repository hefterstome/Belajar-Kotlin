package app

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/*
 ** READ WRITE PROPERTY: interface generic yang bisa didelegate
    > Bersifat mutable (var)
    > Terdapat dua function berupa set dan get
*/

class StringLogReadWriteProperty(var data: String) : ReadWriteProperty<Any, String> { //Any digunakan untuk siapa saja yang mengakses, string untuk tipe datanya
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get data ${property.name} with value $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set data ${property.name} from $data to $value")
        data = value
    }
}

class Person(var param: String) {
    var name: String by StringLogReadWriteProperty(param)
}

fun main() {
    var person = Person("Iqbra")

    println(person.name) //Akan eksekusi fun get

    person.name = "Kurniawan" //Akan eksekusi fun set

    println(person.name) //Akan eksekusi fun get
}